package org.group4.board.services;

import lombok.RequiredArgsConstructor;
import org.group4.board.controllers.BoardPost;
import org.group4.board.entities.BoardData;
import org.group4.board.repositories.BoardDataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardDataSaveService {
    private final BoardDataRepository boardDataRepository;

    public void post(BoardPost boardPost) {
        if (boardPost.getSeq() != null) {//이미 존재하는 게시글이면
            BoardData boardData = new ModelMapper().map(boardPost, BoardData.class);
            boardDataRepository.saveAndFlush(boardData);
        } else {//게시글 등록
            BoardData boardData = BoardData.builder()
                    .title(boardPost.getTitle())
                    .content(boardPost.getContent())
                    .author(boardPost.getAuthor())
                    .build();
            boardDataRepository.saveAndFlush(boardData);
        }
/*        //강사님 코드
        Long seq = Objects.requireNonNullElse(boardPost.getSeq(), 0L);
        BoardData board = boardDataRepository.findById(seq).orElseGet(BoardData::new);

        board.setTitle(boardPost.getTitle());
        board.setContent(boardPost.getContent());
        board.setAuthor(boardPost.getAuthor());
        boardDataRepository.saveAndFlush(board);
        */
    }

}
