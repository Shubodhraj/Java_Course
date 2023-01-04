package JDBC;



//Define JDBC. Perform the operation for connecting java application with mysql database in fetching the records i.e. name,
// address and roll no. of student in student table present in bca database.
import java.sql.*;
import java.util.*;

class Main{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String pass = "12345";
        Scanner k = new Scanner(System.in);
        System.out.println("enter name");
        String name = k.next();
        System.out.println("enter roll");
        int roll = k.nextInt();
        System.out.println("enter class");
        String cls = k.next();
        String sql = "insert into student1 values('"+name+"','"+roll+"', '"+cls+"')";
        Connection con = null;

        try{
            // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1){
                System.out.println("inserted successfully: "+sql);
            }
            else{
                System.out.println("insertion failed");
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}