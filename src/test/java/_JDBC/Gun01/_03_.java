package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_ extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount = 0;
        while (rs.next()){

            System.out.println(rs.getString("city"));
            rowCount++;
        }
        System.out.println(rowCount);

    }
}
