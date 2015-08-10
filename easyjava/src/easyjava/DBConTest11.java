package easyjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConTest11 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		Statement stmt2 = null;
       
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yyj?useUnicode=yes&amp;characterEncoding=UTF-8", "root", "root1234");
			
			System.out.println("mariadb 연결 성공");
			
			int cnt;
			String sId = "abcd";
			String sName = "홍길동";
			
			String sql = "insert into member values ('" + sId + "', '" + sName + "')" ;
			stmt = conn.createStatement();
			cnt = stmt.executeUpdate(sql);
			
			System.out.println("결과="+ cnt);
			
			int cnt2;
			String sId2 = "yyj20934";
			String sName2 = "테스트10";
			
			String sql2 = "insert into member values ('" + sId2 + "', '" + sName2 + "')" ;
			stmt2 = conn.createStatement();
			cnt2 = stmt2.executeUpdate(sql2);
			
			System.out.println("결과2="+ cnt2);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
        } catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (stmt2 != null)
					stmt2.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
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
		/*
		mariadb 연결 성공
		java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'yyj20934' for key 'PRIMARY'
			at org.mariadb.jdbc.internal.SQLExceptionMapper.get(SQLExceptionMapper.java:132)
			at org.mariadb.jdbc.internal.SQLExceptionMapper.throwException(SQLExceptionMapper.java:106)
			at org.mariadb.jdbc.MySQLStatement.executeQueryEpilog(MySQLStatement.java:268)
			at org.mariadb.jdbc.MySQLStatement.execute(MySQLStatement.java:296)
			at org.mariadb.jdbc.MySQLStatement.executeUpdate(MySQLStatement.java:325)
			at org.mariadb.jdbc.MySQLStatement.executeUpdate(MySQLStatement.java:357)
			at easyjava.DBConTest10.main(DBConTest10.java:24)
		Caused by: org.mariadb.jdbc.internal.common.QueryException: Duplicate entry 'yyj20934' for key 'PRIMARY'
			at org.mariadb.jdbc.internal.mysql.MySQLProtocol.getResult(MySQLProtocol.java:982)
			at org.mariadb.jdbc.internal.mysql.MySQLProtocol.executeQuery(MySQLProtocol.java:1042)
			at org.mariadb.jdbc.MySQLStatement.execute(MySQLStatement.java:289)
			... 3 more
		mariadb 연결 종료
		*/

	}
}
