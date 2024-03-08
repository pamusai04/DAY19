import java.sql.*;
public class insertjdbc{
	public static void main(String [] args){
		try{
			//step 1 : load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step 2 : creating a connection
			String url="jdbc:mysql://localhost:3306/sai";
			String username="root";
			String password="Sai@042003";
			Connection con=DriverManager.getConnection(url,username,password);
			//step 3: create statement object
			
			Statement stmt=con.createStatement();
			//step 4: execute the query
			//stmt.executeUpdate("write queery")
				
			String q="create table table1(tid int(20) primary key auto_increment, tname varchar(200) not null, tciry varchar(400))";
			
			stmt.executeUpdate(q);
			System.out.println("table created in database");
			//step 5: close the connection
			con.close();


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}