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
	<script type="text/javascript">
				console.log("아씨 뭘로 들어왔냐   " + '${pgn.searchKind}');
				console.log("아씨 뭘로 들어왔냐   " + '${pgn.searchType}');
				console.log("아씨 뭘로 들어왔냐   " + '${pgn.keyword}');
		</script>
	<div>
		<div>
			<form class="form-inline head-info2">
				<div>
					<div class="form-group">
						<c:choose>
							<c:when test="${pgn.searchKind == 'all'}">
								<label> <input type="radio" name="searchKind" id="ra1-info" value="all" checked="checked">&nbsp;전체&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra2-info" value="uncomplete">&nbsp;미완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra3-info" value="complete">&nbsp;완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra4-info" value="limit">&nbsp;기한초과
								</label>
							</c:when>
							<c:when test="${pgn.searchKind == 'uncomplete'}">
								<label> <input type="radio" name="searchKind" id="ra1-info" value="all">&nbsp;전체&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra2-info" value="uncomplete" checked="checked">&nbsp;미완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra3-info" value="complete">&nbsp;완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra4-info" value="limit">&nbsp;기한초과
								</label>
							</c:when>
							<c:when test="${pgn.searchKind == 'complete'}">
								<label> <input type="radio" name="searchKind" id="ra1-info" value="all">&nbsp;전체&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra2-info" value="uncomplete">&nbsp;미완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra3-info" value="complete" checked="checked">&nbsp;완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra4-info" value="limit">&nbsp;기한초과
								</label>
							</c:when>
							<c:when test="${pgn.searchKind == 'limit'}">
								<label> <input type="radio" name="searchKind" id="ra1-info" value="all">&nbsp;전체&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra2-info" value="uncomplete">&nbsp;미완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra3-info" value="complete">&nbsp;완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra4-info" value="limit" checked="checked">&nbsp;기한초과
								</label>
							</c:when>
							<c:otherwise>
								<label> <input type="radio" name="searchKind" id="ra1-info" value="all" checked="checked">&nbsp;전체&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra2-info" value="uncomplete">&nbsp;미완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra3-info" value="complete">&nbsp;완료&nbsp;
								</label>
								<label> <input type="radio" name="searchKind" id="ra4-info" value="limit">&nbsp;기한초과
								</label>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div>
					<div class="form-group">
						<select class="form-control" name="searchType" id="searchType">
							<c:choose>
								<c:when test="${pgn.searchType == 'title'}">
									<option value="title" selected="selected">제목</option>
									<option value="contents">본문</option>
									<option value="name">작성자</option>
								</c:when>
								<c:when test="${pgn.searchType == 'contents'}">
									<option value="title">제목</option>
									<option value="contents" selected="selected">본문</option>
									<option value="name">작성자</option>
								</c:when>
								<c:when test="${pgn.searchType == 'name'}">
									<option value="title">제목</option>
									<option value="contents">본문</option>
									<option value="name" selected="selected">작성자</option>
								</c:when>
								<c:otherwise>
									<option value="title">제목</option>
									<option value="contents">본문</option>
									<option value="name">작성자</option>
								</c:otherwise>
							</c:choose>
						</select>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="keyword" id="keyword" placeholder="검색어를 입력해주세요." value="${pgn.keyword}">
					</div>
					<button type="submit" class="btn btn-default" name="btnSearch" id="btnSearch">검색</button>
				</div>
			</form>
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
										<td><img src="/resources/common/img/comp.png" style="width: 30px;
	height: 30px;
	border-radius: 50%;" alt=""></td>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${list.grade > 0}">
												<td><img src="/resources/common/img/neu.png" style="width: 30px;
	height: 30px;
	border-radius: 50%;" alt=""></td>
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
											<span style="color: blue;
	font-size: 13px;
	font-weight: 550">&nbsp;[<c:out value="${list.cnt}" />]
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
		<div class="pgBox">
			<ul class="pagination">
				<c:if test="${pgn.prev}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_prev('${pgn.page}', '${pgn.range}', '${pgn.rangeSize}', '${pgn.searchKind }', '${pgn.searchType }', '${pgn.keyword}')">Previous</a></li>
				</c:if>
				<c:forEach begin="${pgn.startPage}" end="${pgn.endPage}" var="idx">
					<li class="page-item <c:out value="${pgn.page == idx ? 'active' : ''}"/> "><a class="page-link" href="#"
						onClick="fn_pagination('${idx}', '${pgn.range}', '${pgn.rangeSize}', '${pgn.searchKind }', '${pgn.searchType }', '${pgn.keyword}')"> ${idx}
					</a></li>
				</c:forEach>
				<c:if test="${pgn.next}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_next('${pgn.range}', '${pgn.range}', '${pgn.rangeSize}', '${pgn.searchKind }', '${pgn.searchType }', '${pgn.keyword}')">Next</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/infomation/infomation.js"></script>
</html>