package javaviradonojiraya.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriveManager -> interfaces para conexão com DB
    public static Connection getConnection () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);

    }

}
