<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="./header.jsp"%>
<main>
	<h2>현재 한국 시간 ${serverTime}</h2>
	<p>boardNo ${board.boardNo}</p>
	<p>Title ${board.title}</p>
	<p>Content ${board.content}</p>
	<p>Writer ${board.writer}</p>
	<p>RegDate ${board.regDate}</p>
</main>
<%@ include file="./footer.jsp"%>
