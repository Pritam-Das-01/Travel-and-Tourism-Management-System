package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root","Pritam@01");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
