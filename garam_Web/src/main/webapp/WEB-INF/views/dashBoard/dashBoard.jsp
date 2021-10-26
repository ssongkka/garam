<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ page import="com.garam.common.util.save_Map"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/cal.css?after">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/dashCss/dashBoard.css?after">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/dashCss/dashEmp.css?after">
</head>

<body>
	<div class="dash-board-main">
		<main>
			<div class="dash-Main">
				<div class="item_Main card-song dash-cal">
					<div class="dash-cal-h">
						<div class="dash-cal-h-item dash-cal-h-item1" id="fnDownMonth"
							style="cursor: pointer;">
							<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
								fill="currentColor" class="bi bi-chevron-left"
								viewBox="0 0 16 16">
								<path fill-rule="evenodd"
									d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z" /></svg>
						</div>
						<div class="dash-cal-h-item dash-cal-h-item2" id="yearMonth"></div>
						<div class="dash-cal-h-item dash-cal-h-item3" id="fnUpMonth"
							style="cursor: pointer;">
							<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
								fill="currentColor" class="bi bi-chevron-right"
								viewBox="0 0 16 16">
								<path fill-rule="evenodd"
									d="M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z" /></svg>
						</div>
						<div class="dash-cal-h-item dash-cal-h-item4">
							<button type="button" class="btn btn-primary btn-xs" id="btnYesD">어제</button>
							<button type="button" class="btn btn-default btn-xs" id="btnToD">오늘</button>
							<button type="button" class="btn btn-default btn-xs" id="btnTomD">내일</button>
						</div>
					</div>
					<div class="dash-cal-con" id="dash-cal-contents"></div>
				</div>
				<div class="item_Main card-song">
					<div class="dash-2">
						<div class="dash-2-item dash-2-item1">
							<blockquote>
								<p id="bigDay">2021년 09월 02일</p>
								<footer>
									<cite title="Source Title" id="cal1">&nbsp;</cite>
								</footer>
							</blockquote>
						</div>
						<div class="dash-2-item dash-2-item2" id="cal2"></div>
					</div>
				</div>
				<div class="item_Main" style="padding: 0px">
					<div class="dash-3">
						<div class="dash-3-item card-song">
							<div class="dash-3-item-1 card-title">대 형</div>
							<div class="dash-3-item-2" id="dash-45-u">
								<strong id="dash-45-u">35</strong>
							</div>
							<div class="dash-3-item-3" id="dash-45-d">35 / 35 / 35</div>
						</div>
						<div class="dash-3-item card-song">
							<div class="dash-3-item-1 card-title">중 형</div>
							<div class="dash-3-item-2">
								<strong id="dash-25-u">35</strong>
							</div>
							<div class="dash-3-item-3" id="dash-25-d">35 / 35 / 35</div>
						</div>
						<div class="dash-3-item card-song">
							<div class="dash-3-item-1 card-title">우 등</div>
							<div class="dash-3-item-2" id="dash-28-u">
								<strong id="dash-28-u">35</strong>
							</div>
							<div class="dash-3-item-3" id="dash-28-d">35 / 35 / 35</div>
						</div>
					</div>
				</div>
				<div class="item_Main" style="padding: 0px">
					<div class="dash-4">
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-0"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-0"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-0">-</div>
							<div class="dash-4-item-4" id="dash-bus-0">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-1"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-1"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-1">-</div>
							<div class="dash-4-item-4" id="dash-bus-1">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-2"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-2"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-2">-</div>
							<div class="dash-4-item-4" id="dash-bus-2">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-3"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-3"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-3">-</div>
							<div class="dash-4-item-4" id="dash-bus-3">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-4"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-4"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-4">-</div>
							<div class="dash-4-item-4" id="dash-bus-4">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-5"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-5"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-5">-</div>
							<div class="dash-4-item-4" id="dash-bus-5">35 / 35 / 35</div>
						</div>
						<div class="dash-4-item card-song">
							<div class="dash-4-item-1 card-title" id="dash-week-6"></div>
							<div class="dash-4-item-2">
								<strong id="dash-day-6"></strong>
							</div>
							<div class="dash-4-item-3" id="dash-hol-6">-</div>
							<div class="dash-4-item-4" id="dash-bus-6">35 / 35 / 35</div>
						</div>

					</div>
				</div>
				<div class="item_Main card-song" style="padding: 0px">
					<div class="dash-5">
						<div class="dash-5-item-1 card-title">운 행 정 보</div>
						<div role="tabpanel" style="margin-top: 0.3rem">
							<!-- Nav tabs -->
							<ul class="nav nav-pills nav-justified dash-5-item-1-main"
								role="tablist">
								<li role="presentation" class="active dash-5-item-1-1"><a
									href="#all" aria-controls="all" role="tab" data-toggle="tab"
									style="border-radius: 0px">전체</a></li>
								<li role="presentation" class="dash-5-item-1-1"><a
									href="#school" aria-controls="school" role="tab"
									data-toggle="tab" style="border-radius: 0px">학생단체</a></li>
								<li role="presentation" class="dash-5-item-1-1"><a
									href="#nomal" aria-controls="nomal" role="tab"
									data-toggle="tab" style="border-radius: 0px">일반</a></li>
								<li role="presentation" class="dash-5-item-1-1"><a
									href="#days" aria-controls="days" role="tab" data-toggle="tab"
									style="border-radius: 0px">정기운행</a></li>
							</ul>

							<!-- Tab panes -->
							<div class="tab-content" style="margin-top: 0.3rem">
								<div role="tabpanel" class="tab-pane active" id="all">
									<table
										class="table table-striped table-bordered table-hover table-condensed">
										<thead>
											<tr>
												<th>NO</th>
												<th>예약신청자</th>
												<th>대수</th>
												<th>배차</th>
											</tr>
										</thead>

										<tbody>
											<tr>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>

											</tr>
											<tr>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>

											</tr>
											<tr>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>

											</tr>
											<tr>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>
												<td>aaa</td>

											</tr>
										</tbody>
									</table>
								</div>
								<div role="tabpanel" class="tab-pane" id="school">학생단체</div>
								<div role="tabpanel" class="tab-pane" id="nomal">일반</div>
								<div role="tabpanel" class="tab-pane" id="days">정기운행</div>
							</div>

						</div>
					</div>
				</div>
				<div class="item_Main card-song" style="padding: 0px">
					<div class="dash-6">
						<div class="dash-6-item-1 card-title" data-toggle="tooltip"
							title="" data-original-title="Default tooltip">승 무 원</div>
						<div class="dash-6-item-2"
							style="height: 40px; max-height: 40px; margin-top: 0.3rem;">
							<div class="in3">
								<input type="search" class="form-control input-sm"
									placeholder="검   색">
							</div>
						</div>
						<div class="dash-6-item-3">
							<table
								class="table table-striped table-bordered table-condensed table-hover"
								style="margin-top: 0.3rem">
								<colgroup>
									<col style="width: 40%;" />
									<col style="width: auto;" />
								</colgroup>
								<thead>
									<tr>
										<th style="text-align: center">이름</th>
										<th style="text-align: center">연락처</th>
									</tr>
								</thead>
								<tbody id="tbEmp"></tbody>
							</table>
							<div id="paginationBoxEmp"></div>

							<!-- Modal -->
							<div class="modal fade bs-example-modal-lg" id="modal-emp"
								tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
								aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h4 class="modal-title" id="myModalLabel">Modal title</h4>
										</div>
										<div class="modal-body" id="modal-body-emp">...</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">닫 기</button>
										</div>
									</div>
								</div>
							</div>
							<!-- Modal -->
						</div>
					</div>
				</div>
				<div class="item_Main card-song" style="padding: 0px">
					<div class="dash-6">
						<div class="dash-6-item-1 card-title" data-toggle="tooltip"
							title="" data-original-title="Default tooltip">차 량</div>
						<div class="dash-6-item-2"
							style="height: 40px; max-height: 40px; margin-top: 0.3rem;">
							<div class="in3">
								<input type="search" class="form-control input-sm"
									placeholder="검   색">
							</div>
						</div>
						<div class="dash-6-item-3">
							<table
								class="table table-striped table-bordered table-condensed table-hover"
								style="margin-top: 0.3rem">
								<colgroup>
									<col style="width: 40%;" />
									<col style="width: auto;" />
								</colgroup>
								<thead>
									<tr>
										<th style="text-align: center">차량</th>
										<th style="text-align: center">연락처</th>
									</tr>
								</thead>
								<tbody id="tbVE"></tbody>
							</table>
							<div id="paginationBoxVE"></div>
							<!-- Modal -->
							<div class="modal fade bs-example-modal-lg" id="modal-VE"
								tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
								aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h4 class="modal-title" id="myModalLabel">Modal title</h4>
										</div>
										<div class="modal-body" id="modal-body-ve">...</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">닫 기</button>
										</div>
									</div>
								</div>
							</div>
							<!-- Modal -->
						</div>
					</div>
				</div>
				<div class="item_Main card-song" style="padding: 0px">
					<div class="dash-7">
						<h2>
							<label for="nav-toggle"> <span class="las la-bars">
							</span>
							</label>
						</h2>
					</div>
				</div>
			</div>
		</main>
	</div>
	<input type="checkbox" id="nav-toggle">
	<div class="side-R">
		<div class="side-R-item1 card-song">
			<div class="side-R-item1-items">
				<a>1</a>
			</div>
			<div class="side-R-item1-items">
				<a>1</a>
			</div>
			<div class="side-R-item1-items">
				<a>1</a>
			</div>
			<div class="side-R-item1-items">
				<a>1</a>
			</div>
		</div>
		<div class="side-R-item2 card-song">
			<div class="card">
				<div class="card-header">
					공지 사항
					<button type="button" class="btn btn-primary btn-sm">
						등록&nbsp;<i class="las la-plus-circle"></i>
					</button>
				</div>
				<div class="card-body">
					<table
						class="table table-striped table-bordered table-condensed table-hover"
						style="margin-top: 0.3rem">
						<colgroup>
							<col style="width: 40%;" />
							<col style="width: auto;" />
						</colgroup>
						<thead>
							<tr>
							</tr>
						</thead>
						<tbody id="tbInfo">
							<tr data-toggle="collapse" href="#dash-collapse-01"
								aria-expanded="true" aria-controls="dash-collapse-01">
								<td>
									<div class="dash-info">
										<div class="dash-info-item">
											<img
												src="${pageContext.request.contextPath}/resources/common/img/stop.png"
												width="23px" height="23px" alt="">
										</div>
										<div class="dash-info-item">Lewis S. Cunningham</div>
										<div class="dash-info-item">부장 홍길동</div>
										<div class="dash-info-item">
											<i class="las la-history"></i>2011-04-20까지
										</div>
										<div class="dash-info-item">2021-04-20</div>
									</div>
									<div id="dash-collapse-01"
										class="panel-collapse collapse collapse-01" role="tabpanel">
										<div class="dash-collapse-01-body">Anim pariatur cliche
											reprehenderit, enim eiusmod high life accusamus terry
											richardson ad squid. 3 wolf moon officia aute, non cupidatat
											skateboard dolor brunch. Food truck quinoa nesciunt laborum
											eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
											it squid single-origin coffee nulla assumenda shoreditch et.
											Nihil anim keffiyeh helvetica, craft beer labore wes anderson
											cred nesciunt sapiente ea proident. Ad vegan excepteur
											butcher vice lomo. Leggings occaecat craft beer
											farm-to-table, raw denim aesthetic synth nesciunt you
											probably haven't heard of them accusamus labore sustainable
											VHS.</div>
										<div class="dash-collapse-btn">
											<div class="dash-collapse-btn-item">
												<button type="button"
													class="btn btn-primary btn-xs btn-block btn-danger">
													<i class="las la-trash-alt"></i>&nbsp;삭제
												</button>
											</div>
											<div class="dash-collapse-btn-item">
												<button type="button"
													class="btn btn-primary btn-xs btn-block btn-warning">
													<i class="las la-sync"></i>&nbsp;수정
												</button>
											</div>
											<div class="dash-collapse-btn-item">
												<button type="button"
													class="btn btn-primary btn-sm btn-block btn-success">
													<i class="las la-plus-circle"></i>&nbsp;완료
												</button>
											</div>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<!-- Modal -->
					<div class="modal fade" id="modal-info" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="myModalLabel">Modal title</h4>
								</div>
								<div class="modal-body" id="modal-body-info">
									<form>
										<div class="form-group input-group-lg">
											<label for="title-info">제목</label> <input type="text"
												class="form-control" id="title-info" placeholder="제목을 입력하세요">
										</div>
										<div class="form-group">
											<label for="title-info">기한</label> <input
												type="datetime-local" class="form-control" id="date-info"
												value="2021-10-22T16:36">
										</div>
										<div>
											<label> <input type="checkbox" id=""> 기한없음
											</label>
										</div>
										<div class="form-group">
											<label for="cont-info">내용</label>
											<textarea class="form-control" id="cont-info"></textarea>
										</div>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">닫 기</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- Modal -->
				</div>
			</div>
		</div>
		<div class="side-R-item3 card-song"></div>
	</div>
</body>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/calendarJS.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/Pagination.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/common/js/dashboardJS/dashboard.js"></script>
</html>
