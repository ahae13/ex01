package basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProcedureTest {

	public static void main(String[] args) {
		final String url = "jdbc:oracle:thin:@localhost:1521/xe";
		final String uid = "green01";
		final String upw = "1234";
		Connection conn = null;
		//PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			CallableStatement cstmt = conn.prepareCall("{call proc00(?)}");
			cstmt.setInt(1, 3);
			cstmt.executeQuery();
			
			cstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
