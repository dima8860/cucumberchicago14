package TestingDATABASE;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseExample {
    public static void main(String[] args) {
        // url: ec2-18-222-31-72.us-east-2.compute.amazonaws.com
        // port: 1521
        // SID: xe
        // username: hr
        // password: hr

     //   String url = "jdbc:oracle:thin:@yoururl:1521:xe";

        String url = "jdbc:oracle:thin:@cybertekschooldb.ckgvmy6l4fr7.us-east-2.rds.amazonaws.com:1521:ORCL";
        String username = "cybertekschooldb";
        String password = "cybertekschooldb1234%";

        // 3 Classes that we need for testing database

        // 1. Connection class ==> (make a connection to database)
        // 2. Statement  ==>  (preparing for writing query)
        // 3. ResultSet  ==>  (passing query and getting results) ==>  datatype is ResultSet

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ResultSet resultSet = statement.executeQuery("select * from school ");
          //  ResultSet resultSet = statement.executeQuery("select first_name, last_name, salary from employees");

          ResultSetMetaData metaData = resultSet.getMetaData(); // ==> info about table
            System.out.println();
            int numberOfColumns = metaData.getColumnCount();  // ==> count of columns
           String columnName1  = metaData.getColumnName(1);
            String columnName2  = metaData.getColumnName(2);
            String columnName3  = metaData.getColumnName(3);

            System.out.println("Index 1 Column Name: " + columnName1);
            System.out.println("Index 2 Column Name: " + columnName2);
            System.out.println("Index 3 Column Name: " + columnName3);

            System.out.println("Numbers of columns: " + numberOfColumns);


         //   resultSet.next(); // switched to 1 row
          //  resultSet.next(); // switched to 2 row
          //  resultSet.next(); // switched to 3 row
          //  resultSet.next(); // switched to 4 row
            List<Map<Object, Object>> data = new ArrayList<>();

            while (resultSet.next()) {

                Map<Object, Object> map = new HashMap<>();

                for(int i = 1; i <= numberOfColumns; i++) {
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }

                data.add(map);

            }



            System.out.println("Connection successful");

            connection.close();
            statement.close();
            resultSet.close();

            for(Map<Object, Object> map: data) {
                System.out.println(map);
            }



        } catch (SQLException e) {
            System.out.println("Connection failed!");
        }

    }
}
