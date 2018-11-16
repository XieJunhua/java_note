package com.junhua.oracle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by xiejunhua on 2018/4/4.
 */
public class OracleTest {
  public static void main(String[] args) {
    readFromOracle();
//    String sql = "INSERT INTO dim_jsid_test VALUES ('000053ba27e5b644116bf75a9e25243d',1260);";
//    String[] arr = sql.split("'");
//    System.out.println(Arrays.toString(arr));

  }


  public static void readFromOracle() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection(
              "jdbc:oracle:thin:@10.11.2.39:49161:XE","entropy","entropy");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from DIM_JSID_test");
      try {


        ArrayList<String> jsIds = new ArrayList<>();

        while (rs.next()) {
          String jsId = rs.getString(1);
          jsIds.add(jsId);
        }

        con.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./dim_jsid.sql")));
        String line = bufferedReader.readLine();
        try {
          while (line != null) {
            String jsId = line.split("'")[1];
            if (!jsIds.contains(jsId)) {
              System.out.println(jsId);
            }
          }
          bufferedReader.close();

        } catch (Exception e) {
          System.out.println(line);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }


    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
