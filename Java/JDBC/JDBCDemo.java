import java.sql.*;

 

public class JDBCDemo{
    public static void main(String ar[]){
        try{
        //Loads the Oracle driver
        Class.forName("com.mysql.cj.jdbc.Driver");  
 
        //Establishes connection to the Oracle database hosted in local mac
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
        System.out.println("Connection established");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Oracle driver not found");
        }
        catch(SQLException ex){
            System.out.println("Connection failed");
        }
    }
}