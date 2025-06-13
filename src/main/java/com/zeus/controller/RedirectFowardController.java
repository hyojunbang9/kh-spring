package com.zeus.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RedirectFowardController {

	// gohome06 get방식으로 요청 -> DB연동 -> /gohome05 redirect ->
	@GetMapping("/sub/gohome06")
	public String gohome06() {
		log.info("/sub/subgohome06");

		return "redirect:/sub/gohome05";
	}

	// gohome05 요청 -> view Resolver를 통해 gohome07을 보여준다.
	@GetMapping("/sub/gohome05")
	public String gohome05() {
		log.info("gohome05");

		return "sub/gohome07";
	}
	
	@ResponseBody
	@GetMapping(value = "/gohome08")
	public Map<String, Board> home08(Model model) {
		log.info("자바빈즈 클래스 타입 home08");
		Map<String, Board> map = new HashMap<>();

		Board board = new Board();
		board.setBoardNo(10);
		map.put("key1", board);

		Board board2 = new Board();
		board2.setBoardNo(30);
		map.put("key2", board2);

		return map;

	}
}