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
		<h1>header!! home0202</h1>
	</header>
	<C:set var="myTitle">${board.title}</C:set>
	<main>
		<h1>MemberMap title 에 저장된 값 출력</h1>
		<p>title =${board.title}</p>
		<p>${myTitle}</p>
	</main>
	<hr>
	<C:set target="${board}" property="title" value="react"></C:set>
	<table border="1">
		<tr>
			<td>${board.title}</td>
		</tr>
	</table>
	<main>
		<h1>MemberMap title 에 저장된 값 출력</h1>
		<p>title =${board.title}</p>
		<p>${myTitle}</p>
	</main>
	<hr>
</body>
</html>