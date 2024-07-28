package org.choongang.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DBConfig.class)
public class DBConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void test1() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
