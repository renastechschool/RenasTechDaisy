package code.jdbc.day01;

import java.sql.*;

public class c3_JDBC {

   public static void main(String[] args) throws SQLException {
        // take connection string into a variable
        String connectionUrl = "jdbc:oracle:thin:@ec2-3-91-68-37.compute-1.amazonaws.com:1521:XE";
        String username="hr";   // create uaername
        String password="hr";   // create password

        // create connection
        Connection con= DriverManager.getConnection(connectionUrl,username,password);
        // create statement
        Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //execute query and store the result in resultSet
        ResultSet resultSet=statement.executeQuery("SELECT * FROM Employees");
        resultSet.next();
        // move the cursor to 10th row
        resultSet.absolute(10);
        System.out.println("First Name: "+resultSet.getString("first_name"));
        System.out.println("Last_Name: "+resultSet.getString("last_name"));
        System.out.println("Email: "+resultSet.getString("email"));

        // iterate through each index of resultset and print the each column
        for(int i=1;i<=resultSet.getFetchSize();i++){
            System.out.print(resultSet.getString(i)+" ");
        }

        // move the cursor to previous position
        resultSet.previous();
        System.out.println("*****------Resultset Previous example---------*****");
        System.out.println("First Name: "+resultSet.getString("first_name"));

        // move the cursor to the first position of the table
        resultSet.first();
        System.out.println("First Name: "+resultSet.getString("first_name"));

        // move the cursor to the last position of the table
        resultSet.last();
        System.out.println("First Name: "+resultSet.getString("first_name"));

        // move the cursor before the first position of the table
         resultSet.beforeFirst();
        //System.out.println("First Name: "+resultSet.getString("first_name"));

        // move the cursor after the first position of the table
        resultSet.afterLast();
        //System.out.println("First Name: "+resultSet.getString("first_name"));
        resultSet.afterLast();
        boolean result=resultSet.isAfterLast();
        System.out.println(result);
        if(resultSet.isAfterLast()){
            System.out.println("After last");
        }

        if(resultSet.isBeforeFirst()){
            System.out.println("Before First");

        }

        resultSet.close();
        boolean isClosed=resultSet.isClosed();
        System.out.println(isClosed);
        statement.close();
        con.close();
    }
}
