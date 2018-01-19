package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		Connection conn = null; //DB연결객체
		ResultSet rs = null; //select한 결과를 저장하는 객체
		Statement stmnt = null; //sql을 실행하기 위한 객체
		String url = null;
		String id = "h5"; //DB ID
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		//url = "jdbc:oracle:thin:@localhost:1521:orcl;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery("select * from employees where employee_id = 100");
			
			while(rs.next()) { //한행씩 레코드를 읽어옴, Fetch, 데이터가 있으면 true
				String employeeId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeeId+","+firstName+","+lastName);
			}
			
			stmnt.close(); //잘 닫아주지 않으면 충돌이 날 수 있다.
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("연결이 되었습니다.");
	}

}
