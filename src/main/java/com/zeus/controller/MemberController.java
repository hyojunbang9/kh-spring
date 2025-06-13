package com.zeus.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

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
}