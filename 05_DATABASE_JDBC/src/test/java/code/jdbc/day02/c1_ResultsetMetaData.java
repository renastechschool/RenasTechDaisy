package code.jdbc.day02;

import code.jdbc.utils.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class c1_ResultsetMetaData {
    public static void main(String[] args) throws SQLException {
        // call the DatabaseUtill to create the connection
        DatabaseUtil.CreateConnection();
        // call the DatabaseUtil to run query
        ResultSet resultSet= DatabaseUtil.runQuery("SELECT * FROM Employees");
        resultSet.next();
        System.out.println("First Employee Name: "+resultSet.getString("first_name"));

        // get information of resultset using getMeteData
        ResultSetMetaData rsmd=resultSet.getMetaData();
        // getColumnCount() brings the number of column in a row
        int columnCount=rsmd.getColumnCount();
        System.out.println("Number of columns: "+columnCount); // print the number of column
        String columnName=rsmd.getColumnName(3); // get the column name at level 3
        System.out.println("Column name at number 3 is: "+columnName); // print the columnName which is at level 3
        // iterate from1 to number of column so that we can print the each column name
        for(int i=1;i<=columnCount;i++){
            // get column name on each level with a tab space
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.print("\n");
        List<String> columnNames=new ArrayList<String>();
        for(int i=1;i<columnCount;i++){
            columnNames.add(rsmd.getColumnName(i));
        }

        System.out.println("get the number of columns from DatabaseUtil: "+ DatabaseUtil.getTotalColumnCount());

        System.out.print(columnNames);

        DatabaseUtil.getAllData();

        DatabaseUtil.closeDatabase();


    }
}
