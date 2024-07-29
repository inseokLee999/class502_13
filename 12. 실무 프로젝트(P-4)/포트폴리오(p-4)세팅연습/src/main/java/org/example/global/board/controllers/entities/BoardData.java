package org.example.global.board.controllers.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BoardData {
    @Id @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String title;//제목
    @Lob
    private String content;//내용

//    @ManyToMany
//    private List<HashTag> tags;//태그
}
