package com.zeus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.domain.CheckBoxLabelValue;
import com.zeus.domain.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("user")
public class UserController {

	@GetMapping(value = "/registerForm")
	public String registerForm(Model model) {
		log.info("registerForm");
		User user = new User();
		user.setUserId("bang");
		user.setUserName("방효준");
		user.setUserPassword("970208");
		user.setIntroduction("내가 최고다.");

		ArrayList<CheckBoxLabelValue> checkBoxList = new ArrayList<CheckBoxLabelValue>();
		checkBoxList.add(new CheckBoxLabelValue("Jihun", "01"));
		checkBoxList.add(new CheckBoxLabelValue("bang", "02"));
		checkBoxList.add(new CheckBoxLabelValue("HaeZZang", "03"));
		model.addAttribute("hobbyBoxList", checkBoxList);

		model.addAttribute("user", user);
		return "user/registerForm";
	}

	@PostMapping(value = "/register")
	public String register(User user) {
		log.info("register");
		log.info("userId = " + user.getUserId());
		log.info("userName = " + user.getUserName());
		log.info("userPassword = " + user.getUserPassword());
		log.info("userintroduction = " + user.getIntroduction());

		ArrayList<String> checkBoxList = user.getCheckBoxList();
		if (checkBoxList != null) {
			log.info("hobbyList != null = " + checkBoxList.size());

			for (int i = 0; i < checkBoxList.size(); i++) {
				log.info("checkBoxList(" + i + ") = " + checkBoxList.get(i));
			}
		} else {
			log.info("checkBoxList == null");
		}
		
		
		return "user/resultForm";
	}

}
