package easyjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConTest7 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
       
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yyj?useUnicode=yes&amp;characterEncoding=UTF-8", "root", "root1234");
			
			System.out.println("mariadb 연결 성공");
			
			int cnt;
			String sId = "test2";
			String sName = "테스트2";
			
			String sql = "insert into member values (?, ?)" ;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sId);
			pstmt.setString(2, sName);
			cnt = pstmt.executeUpdate();
			
			System.out.println("결과="+ cnt);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
        } catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
