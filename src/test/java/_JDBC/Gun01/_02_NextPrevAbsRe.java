package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRe extends JDBCParent {


    @Test
    public void textNextPrev() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language ");
        rs.next(); // ilk satir 1. satir
        System.out.println("1. row  language name = " + rs.getString(2));
        rs.next();
        System.out.println("2. row  language name = " + rs.getString(2));
        rs.next();
        System.out.println("3. row  language name = " + rs.getString(2));
        rs.next();
        System.out.println("4. row  language name = " + rs.getString(2));
    }

    @Test
    public void AbsouletRlative() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");

        // rs.next();
        //rs.previous : onceki satir
        rs.absolute(10);
        System.out.println("10.satir - title = " + rs.getString("title"));

        rs.relative(5);
        System.out.println( rs.getString("title"));

        rs.absolute(5);
        System.out.println( rs.getString("title"));
    }
}
