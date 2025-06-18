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
		<h1>header, Its user/registerForm.jsp</h1>
	</header>
	<hr>
	<main>
		<!-- modelAttribute 속성에 폼 객체의 속성명을 지정한다. -->
		<form:form modelAttribute="user" method="post" action="register">
			<table>
				<tr>
					<td>유저ID</td>
					<td><form:input path="userId" /> <font color="red"><form:errors
								path="userId" /></font></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><form:input path="userName" /> <font color="red">
							<form:errors path="userName" />
					</font></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><form:password path="userPassword" /> <font color="red">
							<form:errors path="userPassword" />
					</font></td>
				</tr>
				<tr>
					<td>소개</td>
					<td><form:textarea path="introduction" rows="6" cols="30" />
					</td>
				</tr>
				<tr>
					<td>명예로운 소환사 :</td>
					<td><form:checkboxes path="checkBoxList"
							items="${hobbyBoxList}" itemValue="value" itemLabel="label" /></td>
				</tr>
				<tr>
					<td>gender</td>
					<td>${userGender}</td>
				</tr>
				<tr>
					<td>nationality</td>
					<td>${user.nationality}</td>
				</tr>
				<tr>
					<td>E-MAIL</td>
					<td><form:input path="email" /><font color="red"><form:errors
								path="email" /></font></td>
				</tr>
			</table>
			<form:button name="register">등록</form:button>
		</form:form>
	</main>
	<hr>
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>