package HACK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class idk
{
           Connection c;
           Statement s;

           idk()
           {
               String url = "jdbc:mysql://localhost:3306/result";
               String username = "root";
               String password = "Raghav@2104";

               try
               {
                   this.c = DriverManager.getConnection(url, username, password);
                   this.s = this.c.createStatement();
               }
               catch (Exception var5)
               {
                   System.out.println(var5);
               }

           }
           public static void main(String args[])
          {
              new idk();
          }
}
