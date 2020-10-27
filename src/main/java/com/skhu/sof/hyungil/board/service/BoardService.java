package com.skhu.sof.hyungil.board.service;

import com.skhu.sof.hyungil.board.domain.repository.BoardRepository;
import com.skhu.sof.hyungil.board.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}