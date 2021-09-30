package emp;
// JDBC 

// ~DAO : DATABASE 와 관련된 작업 클래스
// 커넥션 ,조회 (SELECT) , 삽입, 삭제, 수정

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	// 개별사원 조회
	public EmpDTO getRow(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmpDTO dto = null; // 하나의 행이 나오면 list를 안쓴다
		try {
			con = getConnection();
			// String sql = "select * from emp where empno =" + empno;

			String sql = "select * from emp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);

			rs = pstmt.executeQuery();

			if (rs.next()) { // 하나의 행에서 필드별로 가져오기 + EmpDTO담기
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return dto;

	}

	// 전체 사원조회
	public List<EmpDTO> select() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from emp_temp order by hiredate desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				list.add(dto); // arraylist에 담는것 add
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return list;

	}

	// 급여 오름차순 조회
	public List<EmpDTO> getUp() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> list1 = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select ename,sal from emp_temp order by sal"; // sql 문 결과가 여러개가 나올때는 무조건 List사용
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString(1)); // 순서를 이용해서 1,2설정이 가능함
				dto.setSal(rs.getInt(2));
				list1.add(dto); // arraylist에 담는것 add
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return list1;

	}

	// 특정 사원의 급여 수정
	public boolean updateSal(int empno, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		try {
			con = getConnection();
			String sql = "update emp_temp set sal = ? where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			int result = pstmt.executeUpdate();
			if(result>0) { //업데이트 성공
				updateFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}
	public boolean updateComm(int comm,int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		try {
			con = getConnection();
			String sql = "update emp_temp set comm = ? where sal <= ?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, sal);
			int result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				pstmt.close();
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return updateFlag;
	}
	public boolean insertEmp(EmpDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean insertFlag = false;
		try {
			con = getConnection();
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql+=" values(?,?,?,?,sysdate,?,?,?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5, dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7, dto.getDeptno());
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}
public boolean deleteEmp(int empno) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean deleteFlag = false;
		
		try {
			con = getConnection();
			String sql = "delete emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				deleteFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteFlag;
	}

}
