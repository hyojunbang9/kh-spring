package com.zeus.controller;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//Model이 MAP방식이랑 똑같음!!

//사용자 요청을 받고 정보를 받는다.(http://127.0.0.1:8080/home)
@Controller
public class HomeController {
	@Autowired
	private MessageSource messageSource;

	// http://127.0.0.1:8080/home -> get 방식
	// Model,(Request, Session, Application)
	@RequestMapping(value = "/home")
	public String home(Locale locale, Model model) {
		log.info("여기는 HomeController home() 입니다." + locale.toString());
		log.info("여기는 HomeController home() 입니다." + model.toString());

		// DB 연동 XXX
		// 뷰를 불러준다. (~ : view Resolver)

		Date date = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formatDate = df.format(date);
		// 이 아래부터가 중요함
		// Model !!!!!
		// Request에 넣은 것과 똑같다?
		model.addAttribute("serverTime", formatDate);

		return "home01";
	}

	@GetMapping(value = "/sub")
	public String sub(Model model) {
		Board board = new Board(10, "bhj", "zeus", "방효준", new Date());
		model.addAttribute("board", board);

		return "home02";
	}

	@GetMapping(value = "/home03")
	public String home03() {
		return "home03";
	}

	@RequestMapping(value = "/home04")
	public String home04(Locale locale, Model model) {
		// 문자열 배열과 ArrayList를 만들어서 => VO, DB에서!
		String[] name = { "최지훈", "이해연", "방효준" };
		List<String> nameList = Arrays.asList("최지훈", "이해연", "방효준");
		model.addAttribute("name", name);
		model.addAttribute("nameList", nameList);

		return "home04";
	}

	@RequestMapping(value = "/home05")
	public String home05(Model model) {
		// HashMap을 만들어서(이 HashMap는 DB or 사용자로부터 정보를 가져온다.) 화면으로 보낸다.
		// id, pwd, email, name, date를 보낼 거다!
		Map mMap = new HashMap<>();
		mMap.put("id", "방효준");
		mMap.put("pwd", "123456");
		mMap.put("email", "qkdgywns1004@naver.com");
		mMap.put("name", "bhj");
		mMap.put("date", new Date());
		model.addAttribute("mMap", mMap);

		return "home05";
	}

	@GetMapping("/home0303")
	public String home0303(Model model) {
		Board board = new Board();
		board.setTitle(" ");
		model.addAttribute("board", board);
		return "home0303";
	}

	@GetMapping("/home0202")
	public String home0202(Model model) {
		Board board = new Board();
		board.setTitle("spring boot");
		model.addAttribute("board", board);
		return "home0202";
	}

	// WEB-INF/views/home0901.jsp를 부르는 컨트롤러를 만들어 보시오
	@GetMapping("/home0901")
	public String home0901() {
		return "home0901";
	}

	// WEB-INF/views/boardjstl/search.jsp, get, parameter value, model 전달해서 화면에
	// 출력하시오!
	@RequestMapping("/boardjstl/search")
	public String search(Board board, String title, Model model) {
		log.info("search keyword = " + board);
		log.info("search keyword title = " + title);
		model.addAttribute("board", board);
		return "/boardjstl/search";
	}

	/*
	 * // 이 위 아래 두 문장은 같은 문장임!! void와 String의 차이.
	 * 
	 * @RequestMapping("/boardjstl/search") public void search2(String keyword,
	 * Model model) { log.info("search keyword = " + keyword);
	 * model.addAttribute("keyword", keyword); }
	 */

	@RequestMapping("/boardjstl/list")
	public void list() {
		log.info("/boardjstl/list");
	}

	@RequestMapping("/home1001")
	public void home1001() {
		log.info("/home1001");
	}

	@GetMapping(value = "/")
	public String comeBackHome(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);

		log.info("환영합니다. 클라이언트 지역은 " + locale + "이다.");
		String[] args = { "Lee", "HI" };
		// 스프링 프레임워크로부터 MessageSource를 주입 받은 다음 getMessage 메서드를 호출한다.
		String message = messageSource.getMessage("welcome.message", args, Locale.KOREAN);
		String message2 = messageSource.getMessage("welcome.message", args, Locale.ENGLISH);
		log.info("Welcome message : " + message);
		log.info("Welcome message2 : " + message2);

		model.addAttribute("serverTime", formattedDate);

		return "home"; // 뷰 파일명
	}
}
