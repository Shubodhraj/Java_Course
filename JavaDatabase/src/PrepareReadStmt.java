import java.sql.*;
// mynewp@ssw0rD
public class PrepareReadStmt {
    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/student_data";
        String user = "root";
        String pass = "mynewp@ssw0rD";
        String query = "select * from student1";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);

            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));
                System.out.println();
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
