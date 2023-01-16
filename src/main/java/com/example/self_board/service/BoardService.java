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



    public void writeProcess(Board board){
        boardRepository.save(board);

    }

    public List<Board> listView(){

        return boardRepository.findAll();
    }



}
