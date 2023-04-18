package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static _JDBC.JDBCParent.statement;

public class _04_1111 extends JDBCParent {

    @Test
    public void test1 () throws SQLException {


        ResultSet rs = statement.executeQuery("select city from city");
        rs.last();
        System.out.println("last satir  "+ rs.getString(1));
        rs.first();
        System.out.println("first satir  "+ rs.getString(1));

        rs.last();
        int kacincisatirdayim = rs.getRow();
        System.out.println("kacinciSatirdayim =  " + kacincisatirdayim);

    }
}
