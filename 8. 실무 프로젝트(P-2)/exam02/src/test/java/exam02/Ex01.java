package exam02;

import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex01 {
    @Test
    void test1(){
        SqlSession session = DBConn.getSession();
        List<Board> boards = session.selectList("mappers.BoardMapper.getList");
        boards.forEach(System.out::println);
    }
}
