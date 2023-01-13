package com.example.self_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {

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
    public String boardWriteProcess(String title,String content){

        System.out.println(title + content);



        return "";
    }




}
