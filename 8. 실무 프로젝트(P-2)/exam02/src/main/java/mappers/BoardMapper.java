package mappers;

import board.Board;

import java.util.List;

public interface BoardMapper {
    List<Board> getList();
    int register(Board board);
    int modify(Board board);
    int delete(int seq);
}
