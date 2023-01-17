
import java.sql.*;
// import java.util.*;

public class PreparedInsertStmt {
    public static void main(String args[]){  

        String url = "jdbc:mysql://localhost:3306/student_data";
        String user = "root";
        String pass = "mynewp@ssw0rD";
        String query = "insert into student1 values(?,?,?)";

        try{  
        
        Class.forName("com.mysql.cj.jdbc.Driver");  
          
        Connection con=DriverManager.getConnection(url, user, pass);  
        
          
        PreparedStatement stmt=con.prepareStatement(query);  
        
        stmt.setString(1,"Indrawati");//1 specifies the first parameter in the query  
        
        stmt.setInt(2,204);

        stmt.setString(3, "BECOM");  
          
        int i=stmt.executeUpdate();  
        
        System.out.println(i+" records inserted");  
          
        con.close();  
          
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
          
        }  
    } 









