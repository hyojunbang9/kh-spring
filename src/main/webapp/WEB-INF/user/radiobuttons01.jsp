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
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>resultForm.jsp 입니다.</h1>
	</header>
	<hr>
	<main>
		<form:form modelAttribute="user" method="post" action="/user/register">
			<table>
				<tr>
					<td>성별</td>
					<form:select path="nationality" items="${nationalityCodeMap}" />
				</tr>
			</table>
			<form:button name="register">등록</form:button>
		</form:form>
	</main>
	<hr>
	<footer>
		<h1>Footer 영역입니다.</h1>
	</footer>
</body>
</html>