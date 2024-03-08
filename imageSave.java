import java.sql.*;
import java.io.*;

public class imageSave {
    public static void main(String[] args) {
        try {
            // Step 1: load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: creating a connection
            String url = "jdbc:mysql://localhost:3306/sai";
            String username = "root";
            String password = "Sai@042003";
            Connection con = DriverManager.getConnection(url, username, password);

            // Step 3: create a query
            String q = "insert into images(pic) values (?) ";

            // Step 4: get the PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            // Set the values to the query
            FileInputStream fis = new FileInputStream("C:/Users/91778/Downloads/Internship/DAY19/OIP.jpeg");

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();
            System.out.println("Done...");

            // Step 5: close the connection
            con.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
}
