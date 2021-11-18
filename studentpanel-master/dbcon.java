import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class dbcon {
	ResultSet rs;
	ResultSet d;
	public ResultSet Subject(String sub)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");
			 String query = "SELECT id,Name,Password,Email,Contact FROM admin WHERE Subject='"+sub+"'";
	         java.sql.Statement stm = connection.createStatement();
	         
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public void insert(String id,String Name,String Password,String Email,int Contact)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");

            String query = "INSERT INTO admin VALUES ('" + id +"','" + Name + "','" + Password+ "','"+Email+"',"+Contact+")";

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public void insert1(String Name,String Email,String Course,String Fee,String Paid,String Due,String City,String Country,String Contact,String Roll)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");

            String query1 = "INSERT INTO student VALUES ('" + Name +"','" + Email + "','" + Course + "','"+ Fee +"','"+ Paid +"','"+ Due +"','"+ City +"','"+ Country +"','"+ Contact +"',"+ Roll +")";

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query1);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public ResultSet Alluser()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");
			 String query = "SELECT id,Name,Password,Email,Contact FROM admin";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);         
	         
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet Allstudent()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");
			 String query = "SELECT Name,Email,Course,Fee,Paid,Due,City,Country,Contact,Roll FROM student";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);         
	         
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void delete(String roll)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");

            String sql = "DELETE FROM student  WHERE Roll='"+roll+"'";
			

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(sql);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public ResultSet checkuser(String email)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/munna","root", "");
			 String query = "SELECT Password FROM admin WHERE Email='"+email+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}

	
	
}
