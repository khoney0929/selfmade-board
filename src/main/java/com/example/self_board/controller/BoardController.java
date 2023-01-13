package com.example.self_board.controller;

import com.example.self_board.rpository.Board;
import com.example.self_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    //메인화면
    @GetMapping("/")
    public String boardMain(){

        return "boardmain";
    }

    //글쓰기
    @GetMapping("/board/write")
    public String boardWrite(){

        return "boardwrite";
    }

    //글쓰기 데이터
    @PostMapping("/board/writeprocess")
    public String boardWritePro(Board board){

        boardService.writeProcess(board);


        return "";
    }




}
