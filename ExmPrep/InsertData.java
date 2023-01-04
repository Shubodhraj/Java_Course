package ExmPrep;



//program to fetch data into mysql database import java.sql.*;
import java.sql.*;
public class InsertData {
    
public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/bca";
    String user = "root";
    String pass = "mynewp@ssw0rD";
    try{
        String sql = "insert into student values('your name','your address',integr value)";
        //insert your info in above field.

            Connection con = null;

            Class.forName("com.mysql.cj.jdbc.Driver"); // step 1
            con = DriverManager.getConnection(url, user, pass); // step2

            Statement st = con.createStatement();// step 3 we will create statement for execution.
            int m = st.executeUpdate(sql);
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



