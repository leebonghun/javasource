package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import domain.UserDTO;

public class UserDAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##java";
		String password = "12345";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	//userTBL데이터 모두 가져오기
	public Vector<UserDTO> select() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Vector<UserDTO> vetList = new Vector<UserDTO>();
		
		try {
			con = getConnection();
			String sql = "select * from userTBL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setNo(rs.getInt("no"));
				dto.setUsername(rs.getString("Username"));
				dto.setBrithYear(rs.getInt("birthyear"));
				dto.setAddr(rs.getString("Addr"));
				dto.setMobile(rs.getString("Mobile"));
				vetList.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return vetList;
	}
}
