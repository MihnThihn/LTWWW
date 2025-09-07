package iuh.fit.se.bai2.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/dstaikhoan";
    private static final String USER = "root";
    private static final String PASSWORD = "sapassword";

    // Thêm khối static để tải driver
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}