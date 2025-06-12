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
		<h1>header, home0303</h1>
	</header>
	<main>
		<table border="1">
			<tr>
				<td>\${empty board}</td>
				<td>${empty board}</td>
			</tr>
			<tr>
				<td>\${empty board.title}</td>
				<td>${empty board.title}</td>
			</tr>
		</table>
	</main>

	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>