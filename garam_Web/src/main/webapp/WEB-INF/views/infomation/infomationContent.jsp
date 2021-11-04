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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/infomationCss/infomationContent.css">
</head>
<body>
	<div class="container">
		<div class="infoContent">

			<div class="head-info1">
				<div>
					<h5>공지사항 상세</h5>
				</div>
				<div>
					<a href="${pageContext.request.contextPath}/infomation"> <i
						class="fas fa-pen"></i>&nbsp;목록으로
					</a>
				</div>
			</div>
			<div class="infoContent-titleC" id="infoContent-title">
				<h3>
					<c:out value="${infomationContent.title}" />
				</h3>
			</div>
			<div>
				<span><c:out value="${infomationContent.name}" /></span> <span>&nbsp;|&nbsp;</span>
				<span class="infoContent-stdC" id="infoContent-std">작성일&nbsp;<c:out
						value="${infomationContent.insert_date}" /></span>
			</div>
			<hr>
			<div class="body-content">
				<div class="infoContent-endC" id="infoContent-end">
					<i class="las la-history"></i><span>기한&nbsp;</span> <span><c:out
							value="${infomationContent.date_end}" /></span>
				</div>

				<div class="infoContent-contC" id="infoContent-cont">
					<script type="text/javascript">
						var ddd = '${infomationContent.contents}';
						var htmls = '<div>' + ddd + '</div>';
						$('#infoContent-cont').html(htmls);
					</script>
				</div>
				<div class="body-content-btn">
					<div>
						<a
							class="BaseButton size_default BaseButton--skinGreen fas fa-check"
							onClick="fn_CompleteContent(<c:out
											value="${infomationContent.no}" />)">완료</a>
					</div>
					<div>
						<a class="BaseButton size_default BaseButton--skinGray">삭제</a> <a
							class="BaseButton size_default BaseButton--skinGray">수정</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/smnote.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/infomation/infomationContent.js"></script>
</html>