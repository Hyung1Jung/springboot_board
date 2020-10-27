package com.skhu.sof.hyungil.board.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skhu.sof.hyungil.board.domain.repository.BoardRepository;
import com.skhu.sof.hyungil.board.exception.handler.GlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BoardControllerTest {
    private final ObjectMapper objectMapper;
    private final BoardRepository boardRepository;
    private final WebApplicationContext wac;

    @Autowired
    public BoardControllerTest(ObjectMapper objectMapper, BoardRepository boardRepository , MappingJackson2HttpMessageConverter messageConverter, GlobalExceptionHandler globalExceptionHandler, WebApplicationContext wac) {
        this.objectMapper = objectMapper;
        this.boardRepository = boardRepository;
        this.wac = wac;
    }

    private MockMvc mockMvc;
}