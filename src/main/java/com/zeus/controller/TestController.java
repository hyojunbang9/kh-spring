package com.zeus.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeus.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//@Controller + @ResponseBody
public class TestController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	// 클래스 선언할 때 @RestController 선언할경우 여기서 @ResponseBody 생략해도 된다.
	public @ResponseBody String hello(String name, String no) {
		return "hello" + name + " " + no;
	}

	@RequestMapping(value = "/getBoard", method = RequestMethod.GET)
	public @ResponseBody Board getBoard() {
		Board board = new Board();
		board.setBoardNo(0);
		board.setTitle("Hello");
		board.setContent("zeus");
		board.setWriter("kdj");
		board.setRegDate(new Date());
		return board;
	}

	@RequestMapping(value = "/board/getBoardList", method = RequestMethod.GET)
	public @ResponseBody List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<Board>();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBoardNo(i);
			;
			board.setTitle("Hello");
			board.setContent("zeus");
			;
			board.setWriter("kdj");
			;
			board.setRegDate(new Date());
			boardList.add(board);
		}
		return boardList;
	}

}