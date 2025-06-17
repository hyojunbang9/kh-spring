package com.zeus.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zeus.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("member")
public class MemberController {

	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm() {
		log.info("registerForm");

		return "member/registerForm";
	}

	@PostMapping(value = "/register")
	public String register(Member member, String userId) {
		log.info("register");
		log.info("userId = " + userId);
		log.info("member = " + member);
		log.info("member = " + member.getDateOfBirth());

		return "member/success";
	}

	@PostMapping(value = "/registerSelect")
	public String registerSelect(String[] nationality) {
		log.info("registerSelect");
		/*
		 * for (String data : nationality) { log.info("nationality = " + data); }
		 */
		for (int i = 0; i < nationality.length; i++) {
			log.info("nationality = " + nationality[i]);
		}

		return "member/success";
	}

	@PostMapping(value = "/registerBoard")
	public String registerBoard(Member member) {
		log.info("registerBoard");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getPassword() = " + member.getPassword());
		log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
		log.info("member.getBoard().getBoardNo() = " + member.getBoard().getBoardNo());

		return "member/success";
	}

	@PostMapping(value = "/registerFileuUpload")
	public String registerFileuUpload(MultipartFile[] picture) {
		log.info("registerFileuUpload");
		for (MultipartFile data : picture) {
			log.info("serverUseName: " + data.getName());
			log.info("originalName: " + data.getOriginalFilename());
			log.info("size: " + data.getSize());
			log.info("contentType: " + data.getContentType());
			try {
				data.transferTo(new File("D:/springBootUploadFile/" + data.getOriginalFilename()));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "member/success";
	}

	@GetMapping(value = "/registerAjaxFileUpForm")
	public String registerAjaxFileUpForm() {
		log.info("registerAjaxFileUpForm");
		return "member/registerAjaxFileUpForm"; // 뷰 파일명
	}

	@PostMapping(value = "/uploadAjax", produces = "text/plain;charset=UTF-8")
	public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
		String originalFilename = file.getOriginalFilename();
		log.info("originalName: " + originalFilename);
		ResponseEntity<String> entity = new ResponseEntity<String>("UPLOAD SUCCESS" + originalFilename, HttpStatus.OK);
		return entity;
	}

	@GetMapping(value = "/form")
	public String form() {
		log.info("form");
		return "/member/form"; // 뷰 파일명
	}

	@PostMapping(value = "/submit") // RedirectAttributes rttr => 데이터를 임시로 세션에 저장 후 페이지 재요청 시 세션->Request
	public String submit(@RequestParam String name, RedirectAttributes rttr, Model model) { // @RequestParam => 이름을 안 써도
																							// 넘어오게 돼 있다?
		log.info("submit name" + name);
		rttr.addFlashAttribute("message", name + "님이 등록 되었습니다.");
		model.addAttribute("name", name);
		return "redirect:/member/result";
	}

	@GetMapping(value = "/result")
	public String result() {
		log.info("result");
		return "member/result"; // 뷰 파일명
	}
}