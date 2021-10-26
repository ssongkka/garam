$(document).ready(
	function() {
		var now_D = new Date();

		var nowMonth = new Date(now_D.getFullYear(), now_D.getMonth(),
			1);
		var nowDay = new Date(now_D.getFullYear(), now_D.getMonth(),
			now_D.getDate());

		var id = setCalendar(nowMonth, nowDay);
		setCalWhite(id);
		getEmpList(0, gsListSize.gListSize);
		getVEList(0, gsListSize.gListSize);
	}
);

$(document).on(
	'click',
	'#btnYesD',
	function() {

		var now_D = new Date();

		var nowMonth = new Date(now_D.getFullYear(), now_D.getMonth(),
			1);
		var nowDay = new Date(now_D.getFullYear(), now_D.getMonth(),
			now_D.getDate());
		var day = new Date(nowDay.setDate(nowDay.getDate() - 1));

		var id = setCalendar(nowMonth, day);

		setCalWhite(id);
	}
);

$(document).on(
	'click',
	'#btnToD',
	function() {

		var now_D = new Date();

		var nowMonth = new Date(now_D.getFullYear(), now_D.getMonth(),
			1);
		var nowDay = new Date(now_D.getFullYear(), now_D.getMonth(),
			now_D.getDate());

		var id = setCalendar(nowMonth, nowDay);

		setCalWhite(id);
	}
);

$(document).on(
	'click',
	'#btnTomD',
	function() {

		var now_D = new Date();

		var nowMonth = new Date(now_D.getFullYear(), now_D.getMonth(),
			1);
		var nowDay = new Date(now_D.getFullYear(), now_D.getMonth(),
			now_D.getDate());
		var day = new Date(nowDay.setDate(nowDay.getDate() + 1));

		var id = setCalendar(nowMonth, day);

		setCalWhite(id);
	}
);

$(document).on('click', '#fnDownMonth', function() {

	var now_D = fn_get_Year_Month();

	var downMonth = new Date(now_D.setMonth(now_D.getMonth() - 1));

	setCalendar(downMonth, null);
});

$(document).on('click', '#fnUpMonth', function() {

	var now_D = fn_get_Year_Month();

	var upMonth = new Date(now_D.setMonth(now_D.getMonth() + 1));

	setCalendar(upMonth, null);
});

function fn_contentEmp(id) {
	var url = "/dashEmp/getEmpContents"
	var paramData = {
		"id": id
	};

	var htmls = "";

	$.ajax({
		type: 'POST',
		url: url,
		data: paramData,

		success: function(r) {

			if (r.length < 1) {
				htmls = '<div>없음</div>';
			} else {
				htmls = '<div class="emp-card-main card-song">'
					+ '<div class="emp-card-item">'
					+ '<div class="card1">'
					+ '<div class="card1-item">2</div>'
					+ '<div class="card1-item">이름</div>'
					+ '<div class="card1-item">'
					+ r[0].name
					+ '</div>'
					+ '<div class="card1-item">생년월일</div>'
					+ '<div class="card1-item">'
					+ r[0].birthday
					+ '</div>'
					+ '<div class="card1-item">소속</div>'
					+ '<div class="card1-item">'
					+ r[0].company
					+ '</div>'
					+ '<div class="card1-item">구분</div>'
					+ '<div class="card1-item">'
					+ r[0].kind
					+ '</div>'
					+ '<div class="card1-item">연락처</div>'
					+ '<div class="card1-item">'
					+ r[0].phone1
					+ '</div>'
					+ '<div class="card1-item">비상연락처</div>'
					+ '<div class="card1-item">'
					+ r[0].phone2
					+ '</div>'
					+ '<div class="card1-item">입사일</div>'
					+ '<div class="card1-item">'
					+ r[0].joind
					+ '</div>'
					+ '<div class="card1-item">퇴사일</div>'
					+ '<div class="card1-item">'
					+ r[0].endD
					+ '</div>'
					+ '<div class="card1-item">주소</div>'
					+ '<div class="card1-item card1-item-ex" >'
					+ r[0].address
					+ '</div>'
					+ '<div class="card1-item">차고지</div>'
					+ '<div class="card1-item card1-item-ex">'
					+ r[0].garage
					+ '</div>'
					+ '</div>'
					+ '</div>'
					+ '</div>'
			}
			$("#modal-body-emp").html(htmls);
		}
	})
}

function getEmpPaging(page, range) {
	var url = "/dashEmpList/getEmpListCnt";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var html = "";

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',

		success: function(r) {
			fnPageInfo(page, range, r);
			html += '<ul class="pagination pagination-sm">';
			console.log(gsPrev.gPrev);
			if (gsPrev.gPrev) {
				html += '<li class="page-item">';
				html += '<a class="page-link" href="#" onClick="';
				html += '">';
				html += '이전';
				html += '</a></li>';
			}

			console.log("stst  " + gsStartPage.gStartPage);
			console.log("eded  " + gsEndPage.gEndPage);

			for (var i = gsStartPage.gStartPage; i <= gsEndPage.gEndPage; i++) {
				html += '<li class="page-item ';
				if (page == i) {
					html += ' active';
				} else {
					html += '';
				}

				html += '" style="cursor: pointer;"><a class="page-link" onClick="';
				html += 'getEmpList('
					+ ((i - 1) * gsListSize.gListSize) + ','
					+ gsListSize.gListSize + ')';
				html += '">' + i + '</a></li>';
			}

			if (gsNext.gNext) {
				html += '<li class="page-item"><a class="page-link" href="#" onClick="';
				html += '">'
					+ '다음' + '</a></li>';
			}

			html += '</ul>'
			$("#paginationBoxEmp").html(html);
		}
	});
}

function getEmpList(page, range) {
	var url = "/dashEmpList/getEmpList";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	console.log(page);
	console.log(range);

	var paramData = JSON.stringify({
		"num1": page,
		"num2": range
	});

	var html = "";

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',

		success: function(r) {
			if (r.length < 1) {
				html = '<tr>' + '<td colspan="5" align="center">'
					+ '데이터가 없습니다.' + '</td>' + '</tr>'
			} else {
				for (var i = 0; i < r.length; i++) {
					html += '<tr '
						+ 'style="cursor: pointer; color: #blue;"'
						+ 'data-toggle="modal" data-target="#modal-emp"'
						+ 'onClick="fn_contentEmp(\'' + r[i].id
						+ '\')"' + '>'
					html += '<td align="center">' + r[i].name
						+ '</td>';
					html += '<td align="center">' + r[i].phone1
						+ '</td>' + '</tr>';

					// 								htmlP += '<div id="paginationBox">';
					// 								htmlP += '<ul class="pagination pagination-sm">';

				}
			}
			$("#tbEmp").html(html);
			getEmpPaging(page / gsListSize.gListSize + 1, 1);
		}
	});
}

function fn_contentVE(car_number) {
	var url = "/dashVE/getVEContents"
	var paramData = {
		"car_number": car_number
	};

	var htmls = "";

	$.ajax({
		type: 'POST',
		url: url,
		data: paramData,

		success: function(r) {

			if (r.length < 1) {
				htmls = '<div>없음</div>';
			} else {
				htmls = '<div class="emp-card-main card-song">'
					+ '<div class="emp-card-item">'
					+ '<div class="card1">'
					+ '<div class="card1-item">2</div>'
					+ '<div class="card1-item">이름</div>'
					+ '<div class="card1-item">'
					+ r[0].vehicle
					+ '</div>'
					+ '<div class="card1-item">생년월일</div>'
					+ '<div class="card1-item">'
					+ r[0].company
					+ '</div>'
					+ '<div class="card1-item">소속</div>'
					+ '<div class="card1-item">'
					+ r[0].owner
					+ '</div>'
					+ '<div class="card1-item">구분</div>'
					+ '<div class="card1-item">'
					+ r[0].bus
					+ '</div>'
					+ '<div class="card1-item">연락처</div>'
					+ '<div class="card1-item">'
					+ r[0].brand
					+ '</div>'
					+ '<div class="card1-item">비상연락처</div>'
					+ '<div class="card1-item">'
					+ r[0].name
					+ '</div>'
					+ '<div class="card1-item">입사일</div>'
					+ '<div class="card1-item">'
					+ r[0].grade
					+ '</div>'
					+ '<div class="card1-item">퇴사일</div>'
					+ '<div class="card1-item">'
					+ r[0].fuel
					+ '</div>'
					+ '<div class="card1-item">주소</div>'
					+ '<div class="card1-item card1-item-ex" >'
					+ r[0].num
					+ '</div>'
					+ '<div class="card1-item">차고지</div>'
					+ '<div class="card1-item card1-item-ex">'
					+ r[0].color
					+ '</div>'
					+ '</div>'
					+ '</div>'
					+ '</div>'
			}
			$("#modal-body-ve").html(htmls);
		}
	})
}

function getVEPaging(page, range) {
	var url = "/dashVEList/getVEListCnt";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var html = "";

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',

		success: function(r) {
			fnPageInfo(page, range, r);
			html += '<ul class="pagination pagination-sm">';
			console.log(gsPrev.gPrev);
			if (gsPrev.gPrev) {
				html += '<li class="page-item">';
				html += '<a class="page-link" href="#" onClick="';
				html += '">';
				html += '이전';
				html += '</a></li>';
			}

			console.log("stst  " + gsStartPage.gStartPage);
			console.log("eded  " + gsEndPage.gEndPage);

			for (var i = gsStartPage.gStartPage; i <= gsEndPage.gEndPage; i++) {
				html += '<li class="page-item ';
				if (page == i) {
					html += ' active';
				} else {
					html += '';
				}

				html += '" style="cursor: pointer;"><a class="page-link" onClick="';
				html += 'getVEList('
					+ ((i - 1) * gsListSize.gListSize) + ','
					+ gsListSize.gListSize + ')';
				html += '">' + i + '</a></li>';
			}

			if (gsNext.gNext) {
				html += '<li class="page-item"><a class="page-link" href="#" onClick="';
				html += '">'
					+ '다음' + '</a></li>';
			}

			html += '</ul>'
			$("#paginationBoxVE").html(html);
		}
	});
}

function getVEList(page, range) {
	var url = "/dashVEList/getVEList";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	console.log(page);
	console.log(range);

	var paramData = JSON.stringify({
		"num1": page,
		"num2": range
	});

	var html = "";

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',

		success: function(r) {
			if (r.length < 1) {
				html = '<tr>' + '<td colspan="5" align="center">'
					+ '데이터가 없습니다.' + '</td>' + '</tr>'
			} else {
				for (var i = 0; i < r.length; i++) {
					html += '<tr '
						+ 'style="cursor: pointer; color: #blue;"'
						+ 'data-toggle="modal" data-target="#modal-VE"'
						+ 'onClick="fn_contentVE(\'' + r[i].car_number
						+ '\')"' + '>'
					html += '<td align="center">' + r[i].vehicle
						+ '</td>';
					html += '<td align="center">' + r[i].grade
						+ '</td>' + '</tr>';

					// 								htmlP += '<div id="paginationBox">';
					// 								htmlP += '<ul class="pagination pagination-sm">';

				}
			}
			$("#tbVE").html(html);
			getVEPaging(page / gsListSize.gListSize + 1, 1);
		}
	});
}

ClassicEditor
	.create(document.querySelector('#cont-info'))
	.catch(error => {
		console.error(error);
	});



$(document).on(
	'click',
	'#okok',
	function() {

		console.log($('#date-info').val());
		console.log(typeof $('#date-info').val());
	});






