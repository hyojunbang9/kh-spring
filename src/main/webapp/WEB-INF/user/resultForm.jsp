<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- 화면 영역 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form</title>
</head>
<body>
	<header>
		<h1>header, Its user/resultForm.jsp</h1>
	</header>
	<hr>
	<main>
		<h3>Spring Form Result</h3>
		<table border="1">
			<tr>
				<td>유저ID</td>
				<td>${user.userId}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${user.userName}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${user.userPassword}</td>
			</tr>
			<tr>
				<td>소개</td>
				<td>${user.introduction}</td>
			</tr>
			<tr>
				<td>소환사 번호</td>
				<td><c:forEach var="hobby" items="${user.checkBoxList}">
						<c:out value="${hobby}" />
						<br>
					</c:forEach></td>
			</tr>

		</table>
	</main>
	<hr>
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>