package Services.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RDBHandler {
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://" + RDBConfigs.host + ":" + RDBConfigs.port + "/"
                + RDBConfigs.myRDB, RDBConfigs.dbUser, RDBConfigs.dbPassword);
        return conn;
    }
}
