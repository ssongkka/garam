<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/infomationCss/infomation.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/infomationCss/infomationContent.css">
</head>
<body>
	<div class="container">
		<div class="infoContent">

			<div class="head-info1">
				<div>
					<h5>공지사항 상세</h5>
					<input type="hidden" value="${infomationContent.no}" id="infoContent-head">
				</div>
				<div>
					<a href="${pageContext.request.contextPath}/infomation"> <i class="fas fa-pen"></i>&nbsp;목록으로
					</a>
				</div>
			</div>
			<div class="infoContent-titleC" id="infoContent-title">
				<h3>
					<c:out value="${infomationContent.title}" />
				</h3>
			</div>
			<div>
				<span><c:out value="${infomationContent.name}" /></span> <span>&nbsp;|&nbsp;</span> <span class="infoContent-stdC"
					id="infoContent-std">작성일&nbsp;<c:out value="${infomationContent.insert_date_Ch}" /></span> <span>&nbsp;|&nbsp;</span> <span
					class="infoContent-edC" id="infoContent-ed">수정일&nbsp;<c:out value="${infomationContent.edit_date_Ch}" /></span>
			</div>
			<hr>
			<div class="body-content">
				<div class="body-content01">
					<c:set var="grade" value="${infomationContent.grade}" />
					<c:choose>
						<c:when test="${grade > 0}">
							<div class="infoContent-gradeC" id="infoContent-grade">
								<img src="/resources/common/img/neu.png" style="width: 14px;
	height: 14px;
	border-radius: 50%;" alt="">
							</div>
							<div>중요</div>
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
					<div>
						<span class="infoContent-endC" id="infoContent-end"> <i class="las la-history"></i> 기한&nbsp;
						</span> <span><c:out value="${infomationContent.date_end_Ch}" /></span>
					</div>
				</div>

				<div class="infoContent-contC" id="infoContent-cont">
					<script type="text/javascript">
						var ddd = '${infomationContent.contents}';
						var htmls = '<div>' + ddd + '</div>';
						$('#infoContent-cont').html(htmls);
					</script>
				</div>
				<div class="body-content-btn">
					<c:set var="day" value="${infomationContent.date_com_Ch}" />
					<c:choose>
						<c:when test="${day == '미완료'}">
							<div>
								<a class="BaseButton size_default BaseButton--skinGreen fas fa-check"
									onClick="fn_CompleteContent(<c:out
											value="${infomationContent.no}" />)">완료하기</a>
							</div>
						</c:when>

						<c:otherwise>
							<div>
								<a class="BaseButton size_default BaseButton--skinWarring fas fa-undo"
									onClick="fn_UndoCompleteContent(<c:out
											value="${infomationContent.no}" />)">미완료</a>
							</div>
							<div>
								<c:out value="${infomationContent.date_com_Ch}" />
								에 완료됨
							</div>
						</c:otherwise>
					</c:choose>
					<div class="body-content01-item">
						<a class="BaseButton size_default BaseButton--skinGray"
							onclick="fn_deleteContent(<c:out
							value="${infomationContent.no}" />)">삭제</a> <a
							class="BaseButton size_default BaseButton--skinGray"
							onclick="fn_editContent(<c:out
							value="${infomationContent.no}" />)">수정</a>
					</div>
				</div>
			</div>
			<hr>
			<div class="infoContent-replyC">
				<div class="" id="replyList">
					<h4>댓글</h4>
					<ul>
						<li>
							<div class="infoContent-reply-body-in-item">name 01</div>
							<div class="infoContent-reply-body-in-item">content 01</div>
							<div class="infoContent-reply-body-in-item">
								<div>작성일&nbsp;2021.11.05. 21:32&nbsp;</div>
								<div>|</div>
								<div>수정일&nbsp;</div>
								<div>|</div>
								<div style="background: #eff0f2;
	border-radius: 2px;
	padding: 0rem .3rem 0rem .3rem;">
									<a onclick="fn_ShowHiddenReply('replyShow1', 1)">답글쓰기</a>
								</div>
							</div>
						</li>
					</ul>
				</div>
				<hr>
				<div style="margin-top: 2rem;">
					<h5>댓글 작성</h5>
				</div>
				<div class="reply-write">
					<div class="reply-write-item1">부장&nbsp;홍길동</div>
					<div class="reply-write-item2">
						<textarea rows="3" cols="" class="reply-write-item-txarea" id="rereply-write-txa" placeholder="댓글을 입력해 주세요"></textarea>
					</div>
					<div class="reply-write-item3">
						<a class="BaseButton size_mini BaseButton--skinGray" onclick="insert_Reply(0)">등록</a>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/smnote.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/infomation/infomationContent.js"></script>
</html>