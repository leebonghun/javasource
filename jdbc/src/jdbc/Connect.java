package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		Connection con = null;
		//����̹� �ε� 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
		
			//���� �õ�
			//localhost : ���� ��ǻ��
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//url ����
			String user ="c##scott";
			String password ="tiger";
			con =DriverManager.getConnection(url, user, password);
		
			if(con !=null) {
				System.out.println("����Ǿ����ϴ�");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
