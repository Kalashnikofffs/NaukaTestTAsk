package Services;

import Services.database.RDBConstants;
import Services.database.RDBHandler;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import sun.util.calendar.BaseCalendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TODO Вернуть связи в таблице, написаьть нормальные конфиги и константы, написать скрипт на заполнение бд
public class Databasescript {
    public static String singUpEmployee (int tablenumber , String name, String birthday){
        String insert = "INSERT INTO Employees VALUES (50, 'asdasd' , '2014-07-05');";
        return insert;
    }

    public static void main(String[] args)  {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://95.163.211.179:3306/MySQL-9840", "admin", "ZwYjiX4GFspPJp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {

            conn.prepareStatement(singUpEmployee(132435 , "Sergey" , "2014-07-05" )).executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
