package jdbclearning;

import java.sql.*;


public class Launch4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	String url="jdbc:mysql://localhost:3306/studentinfo";
	String user="root";
	String password="Reddy@123";
	Connection connect =DriverManager.getConnection(url, user,password);
	
	Statement statment = connect.createStatement();
	
	String query = "Delete from studentInfo where id=105";
	int rowAffetced =statment.executeUpdate(query );
	
	if(rowAffetced==0)
	{
		System.out.println("failed, There no id");
	}
	else
	{
		System.out.println("Deletde successfully");
	}
	
	connect.close();
	statment.close();

}
}