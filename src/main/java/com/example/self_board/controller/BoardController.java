package com.example.self_board.controller;

import com.example.self_board.rpository.Board;
import com.example.self_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

        return "redirect:/";
    }

    //게시글 목록
    @GetMapping("/board/boardlist")
    public String boardList(Model model){

        model.addAttribute("list", boardService.listView());

        return "boardlist";
    }

    //게시글 상세페이지
    @GetMapping("/board/boarddetailview")
    public String boarddetailview(Model model, Integer id){

        model.addAttribute("board",boardService.boardDetailView(id));

        return "boarddetailview";
    }

    @GetMapping("/board/boarddelete")
    public String boardDelete(Integer id){

        boardService.boardDelete(id);

        return "redirect:/board/boardlist";
    }

    //수정버튼클릭시 id값에 맞는 제목과 내용 불러오기
    @GetMapping("/board/boardmodify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model){

        model.addAttribute("board", boardService.boardDetailView(id));


        return "boardmodify";
    }

    //수정된내용으로 덮어쓰기
    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Board board){

        Board boardTemp = boardService.boardDetailView(id);
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.writeProcess(boardTemp);

        return "redirect:/board/boardlist";

    }

}
