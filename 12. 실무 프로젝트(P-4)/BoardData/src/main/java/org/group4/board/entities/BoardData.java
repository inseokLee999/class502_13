package org.group4.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.group4.global.entities.BaseEntity;
import org.group4.global.entities.BaseMemberEntity;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardData extends BaseMemberEntity {
    @Id
    @GeneratedValue
    private Long seq;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

}
