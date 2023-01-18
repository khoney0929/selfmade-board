package com.example.self_board.service;

import com.example.self_board.rpository.Board;
import com.example.self_board.rpository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //글작성
    public void writeProcess(Board board){
        boardRepository.save(board);

    }

    //게시글목록
    public List<Board> listView(){

        return boardRepository.findAll();
    }

    //게시글 상세 페이지보기
    public Board boardDetailView(Integer id){

        return boardRepository.findById(id).get();
    }



}
