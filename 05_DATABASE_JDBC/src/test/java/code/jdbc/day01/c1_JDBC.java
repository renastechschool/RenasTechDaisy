package code.jdbc.day01;

import java.sql.*;

public class c1_JDBC {
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
        //move cursor to the first row
        resultSet.next();
        // print the value of 1st index
        System.out.println("First column value: "+resultSet.getString(1));
        System.out.println("First column value: "+resultSet.getString("Employee_Id"));
        System.out.println("First column value: "+resultSet.getString(2));
        resultSet.next();
        System.out.println("First column value: "+resultSet.getString(1));
        System.out.println("First column value: "+resultSet.getString("First_Name"));
        resultSet.close();
        statement.close();
        con.close();
    }
}
