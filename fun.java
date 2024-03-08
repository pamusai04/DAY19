import java.sql.*;
public class fun{
	public static void main(String [] args){
		try{
			//step 1 : load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step 2 : creating a connection
			String url="jdbc:mysql://localhost:3306/sai";
			String username="root";
			String password="Sai@042003";
			Connection con=DriverManager.getConnection(url,username,password);
			
			// step 3 : create a query
			String q="insert into table1(tname,tciry) values (?,?) ";

			//step 4 : get the PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);

			//set the values to query 
			// value insert 1 
			//pstmt.setString(1,"Durgesh Tiwari");
			//pstmt.setString(2,"Lucknow");
			pstmt.setString(1,"John");
			pstmt.setString(2,"Kanpur");
			
			pstmt.executeUpdate();
			System.out.println("inserted...");
	
			//step 5: close the connection
			con.close();


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}