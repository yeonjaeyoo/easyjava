package easyjava;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yyj?useUnicode=yes&amp;characterEncoding=UTF-8", "root", "root1234");

			System.out.println("mariadb 연결 성공");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("mariadb 연결 종료");
	}
}
