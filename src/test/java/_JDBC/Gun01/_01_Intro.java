package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";


        Connection connection = DriverManager.getConnection(hostUrl, username, password); // baglanti yaptik , click  1. madde


        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("select * from customer");

        rs.next(); // siradaki 1. satira gitti
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1. satirin  musteri adi ve soyadi = " + firstName + "  " +lastName);

        rs.next();

        connection.close();


    }

}
