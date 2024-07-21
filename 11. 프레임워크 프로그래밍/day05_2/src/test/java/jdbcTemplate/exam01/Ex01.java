package jdbcTemplate.exam01;

import org.choongang.config.DBConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DBConfig.class)
public class Ex01 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1(){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(con->{String sql = "INSERT INTO MEMBER (SEQ,EMAIL,PASSWORD,USER_NAME) VALUES (SEQ_MEMBER.NEXTVAL,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql,new String[]{"SEQ"});
        ps.setString(1,"test12@Test.org");
        ps.setString(2,"t12345678");
        ps.setString(3,"user01");
        return ps;
        },keyHolder);
        System.out.println(result);
        Number key = keyHolder.getKey();
        long seq = key.longValue();
        System.out.println(seq);
    }
}
