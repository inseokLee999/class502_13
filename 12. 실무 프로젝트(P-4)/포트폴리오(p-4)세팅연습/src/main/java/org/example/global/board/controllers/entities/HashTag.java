package org.example.global.board.controllers.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class HashTag {
    @Id @GeneratedValue
    private String tag;
    @ManyToMany(mappedBy = "tags")
    private List<BoardData> items;
}
