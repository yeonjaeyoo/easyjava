package easyjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConTest4 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
	   
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yyj?useUnicode=yes&amp;characterEncoding=UTF-8", "root", "root1234");
			
			System.out.println("mariadb 연결 성공");
			
			int cnt;
			String sId = "test";
			String sName = "테스트2";
			
			String sql = "update member " +
					     "   set name ='" + sName + "' " +
					     " where id = '" + sId + " ' ";
			
			stmt = conn.createStatement();
			cnt = stmt.executeUpdate(sql);
			
			System.out.println("결과="+ cnt);
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	    } catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
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
