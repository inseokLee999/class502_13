package org.youngsan.Board.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.youngsan.Board.controllers.RequestBoard;
import org.youngsan.Board.entities.UserEntity;
import org.youngsan.Board.repositories.BoardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    //등록
    public void pages(RequestBoard requestBoard) {
        Long seq = requestBoard.getSeq();
        if (requestBoard.getSeq() != null){// 수정
            UserEntity userEntity = new ModelMapper().map(requestBoard,UserEntity.class);
            boardRepository.saveAndFlush(userEntity);
        }else{
            UserEntity userEntity = UserEntity.builder()
                    .title(requestBoard.getTitle())
                    .author(requestBoard.getAuthor())
                    .content(requestBoard.getContent())
                    .build();
            boardRepository.saveAndFlush(userEntity);
        }
    }

    //목록
    public List<UserEntity> list() {
        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "seq"));
    }

    //게시글 자세히보기
    public UserEntity detail(Long seq) {
        return boardRepository.findById(seq).orElse(null);
    }

    //수정
    public void update(UserEntity userEntity) {
        boardRepository.save(userEntity);
    }

    public void delete(Long seq) {
        boardRepository.deleteById(seq);
    }


}

