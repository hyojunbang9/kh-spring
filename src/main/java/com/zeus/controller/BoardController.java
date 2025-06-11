package com.zeus.controller;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}