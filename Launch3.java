package jdbclearning;

import java.sql.*;


public class Launch3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url="jdbc:mysql://localhost:3306/studentinfo";
		String user="root";
		String password="Reddy@123";
		Connection connect =DriverManager.getConnection(url, user,password);
		
		Statement statment = connect.createStatement();
		
		
		
		String query ="select * from studentInfo";
		ResultSet rs = statment.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		
	
		
		connect.close();
		statment.close();
		rs.close();
		
		
		

}
}