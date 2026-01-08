package DatabaseProgram;

import java.sql.*;

public class DBProgram {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       String url = "jdbc:mysql://localhost:3306/intro_sql";
       String username = "root";
       String password ="Rootuser";

       Connection con = null;
       Statement statement = null;
       ResultSet rs = null;

       //optional after java 6
       Class.forName("com.mysql.cj.jdbc.Driver");

       con = DriverManager.getConnection(url,username,password);

       statement= con.createStatement();

       String query = "select * from employees";

        rs = statement.executeQuery(query);

        while(rs.next()){

            if(rs.getInt("id")==9) {
                System.out.println(rs.getInt("id") + " " + rs.getString("first_name") + " "+rs.getString("last_name")+ " "+rs.getString("dept"));
            }

        }


        //close connections
        rs.close();
        statement.close();
        con.close();













    }
}
