
import java.sql.*;
import java.io.*;

public class DynamicInputDemo {
    public static void main(String args[]) {
      
        String url = "jdbc:mysql://localhost:3306/student_data";
        String user = "root";
        String pass = "mynewp@ssw0rD";
        String query = "insert into student1(name, roll, cls) values(?,?,?)";

        try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
          
        Connection con=DriverManager.getConnection(url, user, pass);  
          
        PreparedStatement stmt=con.prepareStatement(query);  


        // get the values from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the student: ");
        String name = br.readLine();

        System.out.println("Enter the roll number of the student: ");
        int roll = Integer.parseInt(br.readLine());  

        System.out.println("Enter the faculty of the student: ");
        String clas = br.readLine();

        
        stmt.setString(1,name);//1 specifies the first parameter in the query  
        
        stmt.setInt(2,roll);

        stmt.setString(3, clas);  

          
        int i=stmt.executeUpdate();  
        System.out.println(i+" records inserted");  
          
        con.close();  
          
        }catch(Exception e)

        { 
            System.out.println(e);
        
        }  
          
        } 
}
