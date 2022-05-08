package code.jdbc.utils;

import java.sql.*;

public class DatabaseUtil {

    private static Connection con;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void CreateConnection() throws SQLException {
        String connectionUrl=ConfigurationReader.getProperty("database.url");
        String username=ConfigurationReader.getProperty("database.username");
        String password = ConfigurationReader.getProperty("database.password");
        try{
        con= DriverManager.getConnection(connectionUrl,username,password);
        System.out.println("connection created successfully");
        }
        catch(SQLException throwables){
            System.out.println("Connection Failed............!");
        }
    }

    public static ResultSet runQuery(String query) throws SQLException {
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException throwables){
            System.out.println("An error occurred while executeQuery");
        }
        return resultSet;
    }

    public static int getTotalColumnCount() throws SQLException {
        int columnCount=0;
        try {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            columnCount = rsmd.getColumnCount();
        }
        catch (SQLException throwables){
            System.out.println("An error occurred while counting column");
        }
        return columnCount;
    }

    public static void getAllData() throws SQLException {
        int columnCount=getTotalColumnCount();
        System.out.println();
        while (resultSet.next()){
            for (int i=1;i<=columnCount;i++){
                System.out.print(resultSet.getString(i)+"\t");
            }
            System.out.println();
        }
    }

    public static void closeDatabase() throws SQLException {
        try {
           if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (con != null) {
                con.close();
            }
        }
        catch (SQLException throwables){
            System.out.println("An error occurred while closing connection");
        }
    }

}
