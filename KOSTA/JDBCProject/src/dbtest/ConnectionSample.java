package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// DB ���� ���
		
		// 1. Oracle Driver �غ� >> .jar
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName);		// driver�� �޸𸮿� �ø���
		System.out.println("1. driver load ����");
		
		// 2. DB ���� : Connection Class ���
		Connection conn = null;
		// ����oracle->Properties->DriverProperties->ConnectionURL
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "hr", password = "hr";
		conn = DriverManager.getConnection(url, userid, password);
		System.out.println("2. Connection ����");
		
		// 3. SQL�� ����
		String sql = 
				" select first_name, last_name, salary" +
				" from employees" +
				" where employee_id = 100";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {	// �������ִ���Ȯ��
			String fname = rs.getString(1);
			String lname = rs.getString(2);
			int sal = rs .getInt(3);
			System.out.println(fname + "\t" + lname + "\t" + sal);
		}	
		 
			 // �ڿ��ݳ�... DB��������
			 rs.close();
			 st.close();
			 conn.close();
	}

}
