<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/login.css">
</head>
<body>
	<div class="container">
		<form:form class="form-signin" name="form" id="form" role="form"
			modelAttribute="userVO" method="post"
			action="${pageContext.request.contextPath}/dashBoard">

			<img
				src="${pageContext.request.contextPath}/resources/common/img/img1.png"
				alt="My Image" style="margin-left: -80px;">
			<h2 class="">로그인 해주세요.</h2>
			<input type="text" id="id" class="form-control" placeholder="아이디"
				autofocus>
			<input type="password" id="pw" class="form-control"
				placeholder="비밀번호">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form:form>
	</div>

</body>
</html>