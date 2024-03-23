package org.example.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DbUtil {
    private static Connection connection;

    private static Connection getConnection(){
        if (connection != null){
            return connection;
        } else {
            try {
                Properties properties = new Properties();
                InputStream inputStream = DbUtil.class
                        .getClassLoader()
                        .getResourceAsStream("db.properties?");
            }
        }
    }
}
