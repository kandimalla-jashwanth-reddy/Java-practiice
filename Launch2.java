package jdbclearning;

import java.sql.*;


public class Launch2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/studentinfo";
		String user="root";
		String password="Reddy@123";
		Connection connect =DriverManager.getConnection(url, user,password);
		
	
		Statement statment = connect.createStatement();
		
		
	
		
		String query= "update studentInfo set scity='Hyderabad'  where id=101";
		int rowAffected=statment.executeUpdate(query);
		
		if(rowAffected==0)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("updated sucessfully");
		}
		
		
		connect.close();
		statment.close();
		
		

	}

}