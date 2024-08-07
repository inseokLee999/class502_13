package exam01;

import config.AppCtx;
import member.entities.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbc;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void Test1() {
        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USER_NAME) "
                + "VALUES (SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
        int result = jdbc.update(sql, "test02@gmail.com", "123456", "사용자01");
        System.out.println(result);
    }

    @Test
    void test2() {
        List<Member> members = jdbcTemplate.query("SELECT * FROM MEMBER",
                this::mapper);
        members.forEach(System.out::println);
    }

    @Test
    void test3() {
        String email = "test4@gmail.com";
        Member member = null;
        try {
            member = jdbcTemplate.queryForObject("SELECT * FROM MEMBER WHERE EMAIL = ?", this::mapper/*메서드 참조*/, email);
            System.out.println(member);
        } catch (DataAccessException e) {
            System.out.println("없음");
        }

    }

    @Test
    void test4(){
        int total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MEMBER", int.class);
        System.out.println(total);
    }
    private Member mapper(ResultSet rs, int num) throws SQLException {
        return Member.builder()
                .seq(rs.getLong("SEQ"))
                .email(rs.getString("EMAIL"))
                .password(rs.getString("PASSWORD"))
                .userName(rs.getString("USER_NAME"))
                .regDt(rs.getTimestamp("REG_DT").toLocalDateTime())
                .build();
    }
}
