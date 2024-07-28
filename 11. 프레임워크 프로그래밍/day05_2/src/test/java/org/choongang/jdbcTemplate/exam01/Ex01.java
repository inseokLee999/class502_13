package org.choongang.jdbcTemplate.exam01;

import org.choongang.config.DBConfig;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DBConfig.class)
public class Ex01 {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private MemberMapper memberMapper;

    @Test
    void test1() {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(con -> {
            String sql = "INSERT INTO MEMBER (SEQ,EMAIL,PASSWORD,USER_NAME) VALUES (SEQ_MEMBER.NEXTVAL,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, new String[]{"SEQ"});
            ps.setString(1, "test12@Test.org");
            ps.setString(2, "t12345678");
            ps.setString(3, "user01");
            return ps;
        }, keyHolder);
        System.out.println(result);
        Number key = keyHolder.getKey();
        long seq = key.longValue();
        System.out.println(seq);
    }

    @Test
    void test2() {
        List<Member> members = jdbcTemplate.query("SELECT * FROM MEMBER", new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                return Member.builder()
                        .seq(rs.getLong("SEQ"))
                        .email(rs.getString("EMAIL"))
                        .password(rs.getString("Password"))
                        .userName(rs.getString("USER_NAME"))
                        .regDt(rs.getTimestamp("REG_DT").toLocalDateTime()).build();
            }
        });
        System.out.println(members);
    }

    @Test
    void test3() throws Exception{
        String sql = "SELECT COUNT(*) FROM MEMBER";

        int result = jdbcTemplate.queryForObject(sql,int.class);
        System.out.println(result);
    }
}
