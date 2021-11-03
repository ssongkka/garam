<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/infomationCss/infomation.css">
</head>
<body>
	<div class="container">
		<div class="head-info1">
			<div>
				<h2>공지사항 글쓰기</h2>
			</div>
			<div>
				<a href="${pageContext.request.contextPath}/infomation"> <i
					class="fas fa-pen"></i>&nbsp;취소
				</a>
			</div>
		</div>
		<hr>

		<form class="form-horizontal">
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox" id="check1-info" value="중요">&nbsp;중요&nbsp;&nbsp;&nbsp;
						</label> <label><input type="checkbox" name="ra-info"
							id="check2-info" value="기한없음" checked="checked">&nbsp;기한없음
						</label>
					</div>
				</div>
			</div>
			<div class="form-group" id="insert-timt-div">
				<label for="insert-time" class="col-sm-2 control-label">기&nbsp;&nbsp;한</label>
				<div class="col-sm-10">
					<input type="datetime-local" class="form-control" id="insert-time"
						placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="insert-title" class="col-sm-2 control-label">제&nbsp;&nbsp;목</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="insert-title"
						placeholder="공지 제목을 입력해 주세요.">
				</div>
			</div>
			<div class="form-group">
				<label for="insert-cont" class="col-sm-2 control-label">내&nbsp;&nbsp;용</label>
				<div class="col-sm-10">
					<textarea class="summernote" id="insert-cont" rows="10"></textarea>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Sign in</button>
				</div>
			</div>
		</form>

	</div>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/smnote.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/infomation/infomationForm.js"></script>
</html>