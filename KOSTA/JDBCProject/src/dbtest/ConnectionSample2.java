package dbtest;

import java.sql.*;

public class ConnectionSample2 {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connection)
		
//		String driverName = "oracle.jdbc.driver.OracleDriver";		// �Ѵٵ�
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.172:1521:xe";
		String userid = "hr", password = "hr";
		String sql = "select * from employees";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driverName);
			System.out.println("1. class load ����");
			conn = DriverManager.getConnection(url, userid, password);
			System.out.println("2. Connection ����");
			st = conn.createStatement();				// ��� �����
			rs = st.executeQuery(sql);
			System.out.println("3. SQL ���� ���� ����");
			while(rs.next()) {
				String fname = rs.getString(2);
				int salary = rs.getInt("salary");	// �÷��̸��ֱ�
				Date d = rs.getDate("hire_date");
				System.out.println(fname + "\t" + salary + "\t" + d);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
