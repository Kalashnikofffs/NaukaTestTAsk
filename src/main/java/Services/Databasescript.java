package Services;

import Services.database.Dao;
import Services.database.RDBHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

//скрипт по заполнению базы мок значениями
public class Databasescript {

    public static void main(String[] args) throws IOException, SQLException {
        Dao dao = new Dao();
        dao.getRestDays();



//        String fileName = "src/main/resources/Work_calendar.txt";
//        File f = new File(fileName);
//        List<String> lines = FileUtils.readLines(f, "UTF-8");
//        for (String l : lines
//        ) {
//            String s = l.replace("\"", " ").trim() + "\b";
//            s = s.trim();
//            System.out.println(s);
//            try {
//                if (conn != null) {
//               PreparedStatement prep =  conn.prepareStatement("insert into Work_calendar Values (?,?)");
//               prep.setString(1, s);
//               prep.setString(2,"R");
//               prep.execute();
//                }
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//           }
//
        }

   }


//            for (Object obj : holidaysArr) {
//                System.out.println(obj.toString());
//
//           }









