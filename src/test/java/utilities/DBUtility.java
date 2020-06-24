package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection() throws SQLException {
        switch (Config.getProperty("dbType")) {
            case "oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleURL"), Config.getProperty("oracleUsername"), Config.getProperty("oraclePassword"));
                break;
            case "mysql":
                // create connection for mysql
                break;
            default:
                connection = null;

        }
    }


    public static List<Map<Object, Object>> executeQuery(String query) throws SQLException {

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(query); // storing all data, use point to switch between rows. Default pointing to names of columns
        // to get first data row we need to run resultSet.next() to point to first data row
        ResultSetMetaData metaData = resultSet.getMetaData(); // ==> info about table, column names, count
        int numberOfColumns = metaData.getColumnCount();  // ==> count of columns
        List<Map<Object, Object>> data = new ArrayList<>(); // map gets info key == column name, value == is row number value


        while (resultSet.next()) { // we scrolling 1 row down at a time
            Map<Object, Object> map = new HashMap<>();
            for (int i = 1; i <= numberOfColumns; i++) {
                // we adding to map (which represents whole row) each cell with unique column name and record value: map(column, record)
                // storing each cell in separate map like key == columnName; value == cellData
                map.put(metaData.getColumnName(i), resultSet.getObject(i));  // // map gets info key == column name, value == is row number value
            }
            // adding each map which is each row to our list
            data.add(map);
        }

        return data;
    }

    public static void close() throws SQLException {
        if (connection != null) connection.close();
        if (statement != null) statement.close();
        if (resultSet != null) resultSet.close();
    }

}
