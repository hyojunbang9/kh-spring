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
		<h1>Its HeaderARea/ home04.jsp PAGE</h1>
	</header>
	<hr>
	<main>
		<%--
		<c:forEach></c:forEach>
		<c:if test=""></c:if>
		<c:out value=""></c:out>
		<c:when test=""></c:when> 
		이 네 가지를 주로 사용한다.
		--%>



		<h1>NAME 문자열 배열 출력 <i style="color:red; background-color:beige;" >첨자 형식 출력</i></h1>
		<p>${name[0]}</p>
		<p>${name[1]}</p>
		<p>${name[2]}</p>

		<hr>
		
		<h1><i style="color:red">NAMELIST LIST</i> 문자열 배열 출력</h1>
		<p>${nameList[0]}</p>
		<p>${nameList[1]}</p>
		<p>${nameList[2]}</p>

		<hr>

		<h1>NAME 문자열 배열 출력</h1>
		<c:forEach var="data" items="${name}">
			<p>
				<c:out value="${data}"></c:out>
			</p>
		</c:forEach>

		<hr>

		<h1>NAMELIST LIST 출력</h1>
		<c:forEach var="data" items="${nameList}">
			<p>
				<c:out value="${data}"></c:out>
			</p>
		</c:forEach>
	</main>
	<hr>
	<footer>
		<h1>Its footerArea</h1>
	</footer>
</body>
</html>