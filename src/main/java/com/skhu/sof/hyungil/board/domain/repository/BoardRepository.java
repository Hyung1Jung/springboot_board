package com.skhu.sof.hyungil.board.domain.repository;


import com.skhu.sof.hyungil.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}