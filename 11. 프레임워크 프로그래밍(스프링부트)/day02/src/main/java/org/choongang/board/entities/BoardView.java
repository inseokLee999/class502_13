package org.choongang.board.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BoardView {
    @Id
    @EmbeddedId
    private BoardViewId id;
}
/*
@IdClass(BoardViewId.class)//복합키를 사용하려면 board view id 라는 객체를 따로 만들고 생성자 두개 만들어서 비교 해야함
public class BoardView {
    @Id
    private long seq;
    @Id
    @Column(name = "_uid")//uid 가 예약어라서 이름을 바꿔 줘야한다.
    private int uid;
}
*/
