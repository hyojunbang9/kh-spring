<%@page import="java.util.Locale"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 컨트롤러 영역 -->
<%
//여기는 이제 자바코드입니다.

//지역 객체 참조 변수
Date date = new Date();
DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
String serverTime = df.format(date);
%>
<!-- 화면 영역 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>Its home03.jsp PAGE</h1>
	</header>
	<hr>
	<main>
		<h2>현재 한국 시간 <%= serverTime %>></h2>
	</main>
	<hr>
	<footer>
		<h1>Its footerArea</h1>
	</footer>
</body>
</html>