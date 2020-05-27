package Services.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RDBHandler {


    public RDBHandler() throws SQLException, ClassNotFoundException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://95.163.211.179:3306/<MySQL-9840>", "<admin>", "<ZwYjiX4GFspPJp>");
        Class.forName("com.mysql.jdbc.Driver");

    }
}
