package org.choongang.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HashTag {
    @Id @GeneratedValue
    private String tag;
//    @ManyToMany(mappedBy = "tags")//양 쪽에서 참고할 때에는 한쪽이 주인이 되어야 함
//    @ToString.Exclude
//    private List<BoardData> items;
}
