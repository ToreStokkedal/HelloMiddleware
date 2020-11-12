package no.sto.hello;

import java.sql.Connection;

public class HelloGetMariaConnection {

  public static void main(String[] args) {

    try {
      Connection db = HelloMariaDB.getMariaDBConnection();
      System.out.println(db.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
