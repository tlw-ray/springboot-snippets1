package com.wisely.ch9_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 唐力伟 on 2017/6/1 21:50.
 */
//spring.datasource.driverClassName=oracle.jdbc.OracleDriver
//        spring.datasource.url=jdbc\:oracle\:thin\:@localhost\:1521\:xe
//        spring.datasource.username=boot
//        spring.datasource.password=boot
public class JdbcMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "oracle");
        ResultSet rs = conn.createStatement().executeQuery("select 1 from dual");
        rs.next();
        System.out.println(rs.getInt(1));
        conn.close();
    }
}
