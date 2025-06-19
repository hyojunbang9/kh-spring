<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메시지 처리</title>
</head>
<body>
	<h1>
		환영합니다.<br>
		<spring:message code="welcome.message" arguments="방효준,HI!" />
		<br>
		<spring:message code="welcome.message" arguments="최지훈,HI!" />
		<br>
		<spring:message code="welcome.message" arguments="이해연,HI!" />
	</h1>

	<P>The time on the server is ${serverTime}.</P>
</body>
</html>