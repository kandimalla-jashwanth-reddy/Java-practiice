package jdbclearning;

	import java.util.*;
	import java.sql.*;
	public class launch1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException  {


			//load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
							
			//Esatablish the connection
			String url="jdbc:mysql://localhost:3306/studentinfo";
			String user="root";
			String password="Reddy@123";
			Connection connect =DriverManager.getConnection(url, user,password);
			
			//creating a statment
			Statement statment = connect.createStatement();
			
			
			//execute the query
			String query="Insert into studentInfo(id,sname,sage,scity) values(108,'prasad',25,'Hyderabad')";
			
			try {
				//process the result
				int rowAffected=statment.executeUpdate(query);
				if(rowAffected==1) 
				{
					System.out.println("inserted sucessfully");
				}
			}
			catch(Exception ex)
			{
				System.out.println("Something went wrong or might be deuplicate primary key");
			}
				
			
			statment.close();
			connect.close();
		
		}

	}