package org.youngsan.Board.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.youngsan.Board.entities.UserEntity;

public interface BoardRepository extends JpaRepository<UserEntity, Long>, QuerydslPredicateExecutor<UserEntity> {

}
