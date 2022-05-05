package code.jdbc.day01;

import java.sql.*;

public class c2_JDBC {
   public static void main(String[] args) throws SQLException {
        // take connection string into a variable
        String connectionUrl = "jdbc:oracle:thin:@ec2-3-91-68-37.compute-1.amazonaws.com:1521:XE";
        String username="hr";   // create uaername
        String password="hr";   // create password

        // create connection
        Connection con= DriverManager.getConnection(connectionUrl,username,password);
        // create statement
        Statement statement=con.createStatement();
        //execute query and store the result in resultSet
        ResultSet resultSet=statement.executeQuery("SELECT * FROM Employees");
        resultSet.next();
        //System.out.println("Employee Name: "+resultSet.getString("first_name"));

        while(resultSet.next()){
            System.out.println("Employee Name: "+resultSet.getString("first_name"));
            System.out.println("Employee Email: "+resultSet.getString("email"));
        }

        ResultSet resultSet2=statement.executeQuery("SELECT * FROM Countries");

        resultSet2.next();
        while (resultSet2.next()){
            System.out.println("Country Id: "+resultSet2.getString("Country_Id"));
            System.out.println("Country Name: "+resultSet2.getString("Country_Name"));
        }
        resultSet2.close();
        resultSet.close();
        statement.close();
        con.close();
    }
}
