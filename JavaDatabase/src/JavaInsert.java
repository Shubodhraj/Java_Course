// demo program to fetch data into database using Statement interface. 

import java.sql.*;
import java.util.*;

// vim /etc/mysql/mysql.conf.d/mysqld.cnf
// mynewp@ssw0rD

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_data"; // this is the url format for accessing mysql database.
        String user = "root"; // you have to use the same usename and password which
        String pass = "mynewp@ssw0rD"; // you had set up during installing the mysql.

        try {
            Scanner k = new Scanner(System.in); // here we are taking the input from the user.
            System.out.println("enter name");
            String name = k.next();
            System.out.println("enter roll");
            int roll = k.nextInt();
            System.out.println("enter class");
            String cls = k.next();
            k.close(); //closing the connection of scanner class.

            String sql = "insert into student1 values('" + name + "','" + roll + "', '" + cls + "')";

            Connection con = null;

            Class.forName("com.mysql.cj.jdbc.Driver"); // step 1
            con = DriverManager.getConnection(url, user, pass); // step2

            Statement st = con.createStatement();// step 3 we will create statement for execution.
            int m = st.executeUpdate(sql);

            // step 4.
            // here we have created Statement to execute. We use executeUpdate() function
            // from Statement interface.
            // we will pass our statement to this function. And will prepare to receive
            // message from the database.

            // executeUpdate() function returns boolean values. If operation will succeed,
            // it returs 1 otherwise 0.
            if (m == 1) {
                System.out.println("inserted successfully: " + sql);
            } else {
                System.out.println("insertion failed");

            }

            // step 5
           
            con.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
