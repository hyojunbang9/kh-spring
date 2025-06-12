package com.zeus.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	// http://~:8080/board/read/100 -> url 마지막 경로(path) 값을 int boardNO에 입력
	// 화면을 /board/read.jsp로 viewreserve를 해서 보내달라!
	// model 전송하고 출력화면을 전송
	@GetMapping("/read/{boardNo}")
	public String getRead(@PathVariable("boardNo") int boardNo, Model model) {
		log.info("게시글 번호:" + boardNo);
		model.addAttribute("boardNo", boardNo);

		return "/board/read";
	}

	@GetMapping(value = "/ajaxHome")
	public String ajaxHome() {
		log.info("headers 속성 매핑 ajaxHome");
		return "/board/ajaxHome";
	}

	@GetMapping(value = "/xmlHttpRequest")
	public String xmlHttpRequest() {
		log.info("headers 속성 매핑 ajaxHome");
		return "/board/xmlHttpRequest";
	}

	@GetMapping(value = "/ajaxHomeAccept")
	public String ajaxHomeAcceptRequest() {
		log.info("headers 속성 매핑 ajaxHomeAccept");
		return "/board/ajaxHomeAccept";
	}

	// 여기 위 컨트롤러들은 화면과는 관련이 없고 데이터만 (리액트만) 담당하는 부분임.
	// 리액트는 데이터만 던져주는 역할!

	@GetMapping(value = "/{boardNo}", produces = "application/json")
	public ResponseEntity<Board> readToxml(@PathVariable("boardNo") int boardNo) {
		log.info("read");
		Board board = new Board();
		board.setBoardNo(boardNo);
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		return entity;
	}

	@PutMapping(value = "/{boardNo}", consumes = "application/json") // json 방식에서 consumes = "application/json" 적으나 마나
																		// 똑같다.
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		log.info("수정 Board =" + board);
		log.info("수정 BoardNo =" + boardNo);
		// 디비 연동 -> update -> return 값 주고
		// -> controller에서 리턴 값을 ResponseEntity<String>으로 클라이언트에 보냄
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}

	@PostMapping(value = "/{boardNo}", consumes = "application/json") // json 방식에서 consumes = "application/json" 적으나 마나
	public ResponseEntity<String> modifyPost(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		log.info("수정 post Board =" + board);
		log.info("수정 post BoardNo =" + boardNo);
		// 디비 연동 -> update -> return 값 주고
		// -> controller에서 리턴 값을 ResponseEntity<String>으로 클라이언트에 보냄
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}

	// X-HTTP-Method-Override 요청 헤더 값을 "PUT"으로 지정
	@PutMapping(value = "/{boardNo}", headers = "X-HTTP-Method-Override=PUT")
	public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		log.info("수정 Headers Board =" + board);
		log.info("수정 Headers BoardNo =" + boardNo);
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}

}