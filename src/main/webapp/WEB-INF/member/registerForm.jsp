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
		<h1>header, Its registerForm.jsp</h1>
	</header>
	<hr>
	<main>
		<form action="/member/register" method="post">
			userId: <input type="text" name="userId" value="hong"><br>
			password: <input type="text" name="password" value="1234"><br>
			dateOfBirth: <input type="text" name="dateOfBirth" value="20001020"><br>
			<input type="submit" value="register">
		</form>
		<hr>
		<form action="/member/registerSelect" method="post">
			nationality: <select name="nationality" multiple>
				<option value="Korea" selected>대~한민국! 짝짝짝 짝짝</option>
				<option value="Germany">독일</option>
				<option value="Australia">호주</option>
				<option value="Canada">캐나다</option>
			</select><br> <input type="submit" value="registerSelect">
		</form>
		<hr>
		<form action="/member/registerBoard" method="post">
			userId: <input type="text" name="userId" value="hong"><br>
			password: <input type="text" name="password" value="1234"><br>
			dateOfBirth: <input type="text" name="dateOfBirth" value="20001020"><br>
			boardNo: <input type="text" name="board.boardNo" value="970208"><br>
			<input type="submit" value="register">
		</form>
		<hr>
		<form action="/member/registerFileuUpload" method="post"
			enctype="multipart/form-data">
			userId: <input type="text" name="userId" value="hong"><br>
			password: <input type="text" name="password" value="1234"><br>
			file: <input type="file" name="picture"><br>
			file: <input type="file" name="picture"><br>
			<input type="submit"
				value="register">	
		</form>
	</main>
	<hr>
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>