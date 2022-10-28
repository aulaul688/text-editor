package Visitor;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EnglishDictionary extends Dict {

    @Override
    public boolean accept(Checker checker) {
        try {
            return checker.action(this);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean action(String word) {
        try {
            File file = new File("");
            String filePath = file.getCanonicalPath();
            Boolean result = false;
            //It's a JDBC which is used to connect SQLite
            Class.forName("org.sqlite.JDBC");
            //Establishing a connection to database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"+ filePath + "/src/Visitor/EN.db");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM UK WHERE UK.word ='" + word.toLowerCase() + "' UNION SELECT * FROM US WHERE US.word = '" + word.toLowerCase() + "';");
            while (rs.next()) {
                result = rs.getString("word") != null;
            }
            rs.close();
            conn.close(); //Closing the connection
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
