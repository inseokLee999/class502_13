package org.group4.board.services;

import lombok.RequiredArgsConstructor;
import org.group4.board.entities.BoardData;
import org.group4.board.exceptions.BoardNotFoundException;
import org.group4.board.repositories.BoardDataRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardInfoService {
    private final BoardDataRepository boardDataRepository;

    public BoardData get(Long seq){
        BoardData boardData = boardDataRepository.findById(seq).orElseThrow(BoardNotFoundException::new);

        //2차 데이터 가공 처리
        return boardData;
    }
}
