
//demo program to read data from Mysql database using Statement interface or using static query. 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample {
   
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/student_data";
        String user = "root";
        String pass = "mynewp@ssw0rD";
        String query = "SELECT * from student1";
        // Open a connection
        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // step 1

            Connection conn = DriverManager.getConnection(url, user, pass); // step 2

            Statement stmt = conn.createStatement(); // step 3
            
            //now we will receive the table which we have to access row wise. For this we will use ResultSet
            //interface, which holds the table data obtained from the database.

            ResultSet rs = stmt.executeQuery(query); // step 4
            while (rs.next()) {
                // Display values
                System.out.println("Name: " + rs.getString("name")); //getString("name") method retrievs the
                //information from the name column of the table which is held by rs object.
                System.out.println("Roll: " + rs.getInt("roll"));
                System.out.println("Subject: " + rs.getString("cls"));
                System.out.println("");

            }
            conn.close(); //finally we will close the connection
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}