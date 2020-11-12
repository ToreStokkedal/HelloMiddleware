package no.sto.hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.mariadb.jdbc.MariaDbDataSource;

// https://www.programcreek.com/java-api-examples/?api=org.mariadb.jdbc.MariaDbDataSource
public class HelloMariaDB {
  

public static Connection getMariaDBConnection() throws SQLException{
    String username = "root";
    String password = "password";

    Properties properties = new Properties();
    properties.put("user", username);
    properties.put("password", password);
    properties.put("useBatchMultiSend", "false");
    properties.put("usePipelineAuth", "false");

    String url = "jdbc:mysql://192.168.99.100:3306/db1?useServerPrepStmts=false&useCursorFetch=false&serverTimezone=UTC&allowMultiQueries=false&useBatchMultiSend=false&characterEncoding=utf8";

    MariaDbDataSource mysqlDataSource = new MariaDbDataSource();
    mysqlDataSource.setUrl(url);
    mysqlDataSource.setUser(username);
    mysqlDataSource.setPassword(password);

    return mysqlDataSource.getConnection();
  }
}
