package TestingDATABASE;

import org.junit.Test;

import java.sql.*;

public class Testing {
    @Test
    public void testingDB() throws SQLException {
        String url = "jdbc:oracle:thin:@cybertekschooldb.ckgvmy6l4fr7.us-east-2.rds.amazonaws.com:1521:ORCL";
        String username = "cybertekschooldb";
        String password = "cybertekschooldb1234%";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from teacher");
        ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println(metaData.getColumnCount());


    }
}
