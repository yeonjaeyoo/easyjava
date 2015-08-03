package easyjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.internal.mysql.MySQLProtocol.PrepareResult;

public class DBConTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
        ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yyj?useUnicode=yes&amp;characterEncoding=UTF-8", "root", "root1234");
			
			System.out.println("mariadb 연결 성공");
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("id="+rs.getString("id"));
				System.out.println("name="+rs.getString("name"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
        } catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
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
		
//		mariadb 연결 성공
//		id=yyj20934
//		name=유연재
//		mariadb 연결 종료
	}
}
