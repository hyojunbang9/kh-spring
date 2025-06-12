<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>Its home01.jsp PAGE</h1>
	</header>
	<hr>
	<main>
		<h2>현재 한국 시간 ${serverTime}</h2>
		<p>boardNo ${board.boardNo}</p>
		<p>Title ${board.title}</p>
		<p>Content ${board.content}</p>
		<p>Writer ${board.writer}</p>
		<p>RegDate ${board.regDate}</p>
	</main>
	<hr>
	<footer>
		<h1>Its footerArea</h1>
	</footer>
</body>
</html>