package org.example.global.board.controllers.repositories;

import org.example.global.board.controllers.entities.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDataRepository extends JpaRepository<BoardData, Long> {
}
