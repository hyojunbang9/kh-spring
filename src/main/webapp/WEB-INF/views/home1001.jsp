<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 화면 영역 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>header, home1001</h1>
	</header>
	<main>
		<h4>절대 URL</h4>
		<c:redirect url="http://localhost:8080/boardjstl/list" />
		<h4>redirect 이후의 코드는 실행되지 않는다.</h4>
	</main>
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>