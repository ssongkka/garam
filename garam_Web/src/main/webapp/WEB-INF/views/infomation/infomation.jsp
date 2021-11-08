<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/infomationCss/infomation.css">
</head>
<body>
	<div class="container">
		<div class="head-info1">
			<div>
				<h2>공지사항</h2>
			</div>
			<div>
				<a href="${pageContext.request.contextPath}/infomation/infomationForm"> <i class="fas fa-pen"></i>&nbsp;글작성
				</a>
			</div>
		</div>
		<hr>
		<div class="head-info2">
			<div>
				<div class="col-lg-6">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search for..."> <span class="input-group-btn">
							<button class="btn btn-default" type="button">Go!</button>
						</span>
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
			<div>
				<label> <input type="radio" name="ra-info" id="ra1-info" value="전체" checked="checked">&nbsp;전체&nbsp;
				</label> <label> <input type="radio" name="ra-info" id="ra2-info" value="미완료">&nbsp;미완료&nbsp;
				</label> <label> <input type="radio" name="ra-info" id="ra3-info" value="완료">&nbsp;완료&nbsp;
				</label> <label> <input type="radio" name="ra-info" id="ra4-info" value="기한초과">&nbsp;기한초과
				</label>
			</div>

			<div></div>

		</div>
		<hr>

		<table class="table table-striped table-bordered">
			<colgroup>
				<col style="width: 50px;" />
				<col style="width: auto;" />
				<col style="width: 90px;" />
				<col style="width: 90px;" />
				<col style="width: 90px;" />
			</colgroup>
			<thead>
				<tr>
					<th colspan="2">제목</th>
					<th>기한</th>
					<th>작성일</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty infoList}">
						<tr>
							<td colspan="5" align="center">데이터가 없습니다.</td>
						</tr>
					</c:when>

					<c:when test="${!empty infoList}">
						<c:forEach var="list" items="${infoList}">
							<tr>
								<c:choose>
									<c:when test="${list.date_com_Ch != '미완료'}">
										<td><img src="/resources/common/img/comp.png" style="width: 30px; height: 30px; border-radius: 50%;" alt="">
										</td>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${list.grade > 0}">
												<td><img src="/resources/common/img/neu.png" style="width: 30px; height: 30px; border-radius: 50%;" alt=""></td>
											</c:when>
											<c:otherwise>
												<td></td>
											</c:otherwise>
										</c:choose>
									</c:otherwise>
								</c:choose>
								<td style="text-align: left;"><a href="#" onClick="fn_contentView(<c:out
											value="${list.no}" />)"> <c:out
											value="${list.title}" />
								</a> <c:choose>
										<c:when test="${list.cnt > 0}">
											<span style="color: blue; font-size: 13px; font-weight: 550">&nbsp;[<c:out value="${list.cnt}" />]
											</span>
										</c:when>
									</c:choose></td>
								<td><c:out value="${list.date_end_Ch}" /></td>
								<td><c:out value="${list.name}" /></td>
								<td><c:out value="${list.insert_date_Ch}" /></td>
							</tr>
						</c:forEach>
					</c:when>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/infomation/infomation.js"></script>

</html>