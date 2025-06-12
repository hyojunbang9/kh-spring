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
		<h1>Its HeaderARea/ home05.jsp PAGE</h1>
	</header>
	<hr>
	<main>

		<h1>mMap(HashMap로 되어있음)에 저장된 값 출력 <i style="color:red; background-color:beige;" >첨자 형식 출력</i></h1>
		<p>id = ${mMap["id"]}</p>
		<p>pwd = ${mMap["pwd"]}</p>
		<p>email = ${mMap["email"]}</p>
		<p>name = ${mMap["name"]}</p>
		<p>date = ${mMap["date"]}</p>
	</main>
	<hr>
	<footer>
		<h1>Its footerArea</h1>
	</footer>
</body>
</html>