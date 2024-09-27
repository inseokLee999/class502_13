package org.youngsan.Board.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestBoard {
    private Long seq;
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @NotBlank
    private String content;
}
