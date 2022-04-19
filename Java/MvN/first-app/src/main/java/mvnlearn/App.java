package mvnlearn;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            // Loads the Oracle driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishes connection to the Oracle database hosted in local mac
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
            if (con != null) {

                System.out.println("\nConnection established...\n");

                // Inserting data in database
                String q1 = "insert into emp values(4567, 'yousf', '23')";
                Statement stmt = con.createStatement();

                int x = stmt.executeUpdate(q1);
                if (x > 0)
                    System.out.println("\tSuccessfully Inserted\n");
                else
                    System.out.println("Insert Failed");

            } else {

                System.out.println("Connection not established");
            }
            con.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("MySql driver not found");
        } catch (SQLException ex) {
            System.out.println("Connection failed");
        }
    }
}
