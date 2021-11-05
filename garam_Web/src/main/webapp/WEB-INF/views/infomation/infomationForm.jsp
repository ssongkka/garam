<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

		<form:form class="form-horizontal" name="insert-form" id="insert-form"
			role="form" modelAttribute="InfomationListVO" method="post"
			action="${pageContext.request.contextPath}/infomation/infomationSave">
			<form:hidden path="no" />
			<input type="hidden" name="mode" />

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
						value="">
				</div>
			</div>
			<div class="form-group">
				<label for="title" class="col-sm-2 control-label">제&nbsp;&nbsp;목</label>
				<div class="col-sm-10">
					<form:input path="title" type="text" class="form-control"
						name="title" id="title" placeholder="공지 제목을 입력해 주세요." />
				</div>
			</div>
			<div class="form-group">
				<label for="contents" class="col-sm-2 control-label">내&nbsp;&nbsp;용</label>
				<div class="col-sm-10">
					<form:textarea path="contents" class="summernote" name="contents"
						id="contents" rows="10" />
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default" id="insert-btn">Sign
						in</button>
				</div>
			</div>
			<input type="hidden" name="date_end" id="date_end" value="">
			<input type="hidden" name="grade" id="grade" value="">
			<input type="hidden" name="name" id="name" value="">
		</form:form>
	</div>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/smnote.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/infomation/infomationForm.js"></script>

<script type="text/javascript">
	$(document).ready(
			function() {
				var mode = '<c:out value="${mode}"/>';
				if (mode == 'edit') {
					$("input:hidden[name='no']").val(
							<c:out value="${infomationContent.no}"/>);
					$("input:hidden[name='mode']").val(
							'<c:out value="${mode}"/>');
					$("#title").val(
							'<c:out value="${infomationContent.title}"/>');

					var ddd = '${infomationContent.contents}';
					$('#contents').summernote('pasteHTML', ddd);

					$("#name")
							.val('<c:out value="${infomationContent.name}"/>');

					if ("${infomationContent.grade}" > 0) {
						$('#check1-info').attr("checked", true);
					} else {
						$('#check1-info').attr("checked", false);
					}

					var dEnd = "${infomationContent.date_end}";

					console.log("112   " + dEnd);
					console.log("112   " + dEnd.length);
					console.log("112   " + getCalTimeInputJSP(dEnd));

					if (dEnd.length > 0) {
						$('#check2-info').attr("checked", false);
						$('#insert-timt-div').show();
						$('#insert-time').val(getCalTimeInputJSP(dEnd));
					} else {
						$('#check2-info').attr("checked", true);
						$('#insert-timt-div').hide();
					}
				}
			});
</script>
</html>