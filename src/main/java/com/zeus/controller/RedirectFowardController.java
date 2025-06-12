package com.zeus.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}