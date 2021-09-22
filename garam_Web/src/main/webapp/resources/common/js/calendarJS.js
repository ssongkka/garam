var sat_C = "#0C6FCD";
var sun_C = "#CF2F11";

function setCalendar(now_D, day) {
	var rtn = "";

	$("#yearMonth").empty();
	$("#yearMonth").prepend('<strong style = "font-size: 18px;">' + now_D.getFullYear() + '년 ' + (now_D.getMonth() + 1) + "월" + '</strong>');

	var check = now_D.getMonth();
	var stD = getCalStD(now_D);

	var htmls = '<div class="dash-cal-con-item"><span>월</span></div>' + '<div class="dash-cal-con-item"><span>화</span></div>'
		+ '<div class="dash-cal-con-item"><span>수</span></div>' + '<div class="dash-cal-con-item"><span>목</span></div>'
		+ '<div class="dash-cal-con-item"><span>금</span></div>' + '<div class="dash-cal-con-item cal-sat"><span>토</span></div>'
		+ '<div class="dash-cal-con-item cal-sun"><span>일</span></div>';

	for (var i = 0; i < 42; i++) {
		var a = 0;
		if (i > 0) {
			a = 1;
		}

		stD = new Date(stD.setDate(stD.getDate() + a));
		var days = stD.getFullYear() + "-" + (stD.getMonth() + 1) + "-" + stD.getDate();

		if (check == stD.getMonth()) {
			htmls += '<div class="dash-cal-con-item-c" id="dash-cal-con-item' + (i + 1) + '" onclick="setCalWhite(this.id)"style=""><span>' + stD.getDate() + '</span><input type="hidden" id = "calDay' + (i + 1) + '" value="' + days + '" ></div>\n';
		} else {
			htmls += '<div class="dash-cal-con-item-c" id="dash-cal-con-item' + (i + 1) + '" onclick="setCalWhite(this.id)"style="color: gray;"><span>' + stD.getDate() + '</span><input type="hidden" id = "calDay' + (i + 1) + '" value="' + days + '" ></div>\n';
		}

		if (day != null) {

			if (day.toLocaleDateString() == stD.toLocaleDateString()) {
				rtn = "dash-cal-con-item" + (i + 1);
			}
		}
	}
	$("#dash-cal-contents").html(htmls);

	return rtn;
}

function setCalWhite(e) {
	var calID = "#" + e;

	var dashCal = $('.dash-cal-con-item-t');
	for (var i = 0; i < dashCal.length; i++) {
		$(dashCal[i]).prop('class', 'dash-cal-con-item-c');
	}

	$(calID).prop('class', 'dash-cal-con-item-t')
	var aaa = $(calID).find('input');
	var dayID = "#" + aaa.attr('id');
	var getDay = $(dayID).val();

	setBigDay(getDay);
	setMidDay(getDay);
	setCaldays(getDay);
}

function setBigDay(day) {
	var tmpArr = day.split("-");

	var date = new Date(tmpArr[0], tmpArr[1] + 1, tmpArr[2]);

	$('#bigDay').empty();
	$('#bigDay').prepend(tmpArr[0] + "년 " + tmpArr[1] + "월 " + tmpArr[2] + "일 " + getDayOfWeek(date.getDay()));
}

function setMidDay(day) {
	var tmpArr = day.split("-");
	var daySt = new Date(tmpArr[0], (tmpArr[1] - 1), tmpArr[2]);
	var day = new Date(daySt);

	for (var i = 0; i < 7; i++) {
		var id = "#dash-day-" + String(i);

		if (i === 0) {
			var day = new Date(day.setDate(day.getDate() + 0));
		} else {
			var day = new Date(day.setDate(day.getDate() + 1));
		}


		console.log("asddd  " + day.toLocaleDateString());

		$(id).empty();
		$(id).prepend(day.getDate());
	}

	var a = daySt.getDay();
	var tmp = [];
	for (var i = 0; i < 7; i++) {

		if (a < 7) {
			tmp.push(a);
		} else {
			a = 0;
			tmp.push(a);
		}
		a = a + 1;
	}

	for (var i = 0; i < 7; i++) {
		var id = "#dash-week-" + String(i);

		if (tmp[i] === 0) {
			$(id).css('color', sun_C);
		} else if (tmp[i] === 6) {
			$(id).css('color', sat_C);
		} else {
			$(id).css('color', 'black');
		}

		$(id).empty();
		$(id).prepend(getDayOfWeek(tmp[i]));
	}
}

function setCaldays(day) {
	var url = "/dashCal/getCalList"
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var tmp_Arr = day.split("-");
	console.log(tmp_Arr);

	var tmp_Day = new Date(tmp_Arr[0], parseInt(tmp_Arr[1] - 1), tmp_Arr[2]);
	console.log(tmp_Arr[0]);
	console.log(tmp_Arr[1] + 1);
	console.log(tmp_Arr[2]);
	console.log(tmp_Day.toLocaleDateString());

	var tmp_Day2 = new Date(tmp_Day.setDate(tmp_Day.getDate() + 7));

	var day7 = tmp_Day2.getFullYear() + "-" + (parseInt(tmp_Day2.getMonth()) + 1) + "-" + tmp_Day2.getDate();
	console.log("123123   " + day);
	console.log("123333   " + day7);

	var paramData = JSON.stringify({
		"num1": day,
		"num2": day7
	});

	console.log(paramData);

	var cal1 = "";
	var cal2 = "";
	var cal3 = "";
	var cal4 = "";
	var cal5 = "";
	var cal6 = "";

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',


		success: function(r) {
			console.log(r[0].lunar_Cal);
			console.log(r[0].season);
			console.log(r[0].etc);
			console.log(r[0].holiday);
			console.log(r[0].anniversary);
			console.log(r[0].event);

			if (r.length > 0) {
				cal1 = "음력 " + r[0].lunar_Cal;
				cal2 = '<span>' + r[0].event + '</span>' + '<span style = "color : ' + sun_C + ';">' + r[0].holiday
					+ '</span>' + '<span>' + r[0].anniversary + '</span>' + '<span>' + r[0].season + '</span>'
					+ '<span>' + r[0].etc + '</span>';

				for (var i = 0; i < 7; i++) {
					var id = "#dash-hol-" + String(i);
					var id2 = "#dash-week-" + String(i);

					console.log(r[i].holiday);
					$(id).empty();

					if (r[i].holiday == null) {
						$(id).prepend("");
					} else {
						$(id).prepend(r[i].holiday);
						$(id2).css('color', sun_C);
					}
				}
			}

			console.log(cal1);
			console.log(cal2);
			console.log(cal3);
			console.log(cal4);
			console.log(cal5);
			console.log(cal6);

			$("#cal1").html(cal1);
			$("#cal2").html(cal2);
			$("#cal3").html(cal3);
			$("#cal4").html(cal4);
			$("#cal5").html(cal5);
			$("#cal6").html(cal6);
		}
	})
}

function getCalStD(month) {
	var now_D = month;
	var now_W;
	if (now_D.getDay() === 0) {
		now_W = 7;
	} else {
		now_W = now_D.getDay();
	}
	var day_M = 42 - (43 - now_W);
	var stD = new Date(now_D.setDate(now_D.getDate() - day_M));

	return stD;
}


function fn_get_Year_Month() {
	var aaa = $("#yearMonth").text();
	var now_D = new String(aaa);
	var year = parseInt(now_D.substring(0, 4));
	var month = parseInt(now_D.substring(6, 8));
	var now_Month = new Date(year, month - 1, 1);

	return now_Month;
}

function getDayOfWeek(num) {
	var rtn = "";

	switch (num) {
		case 1:
			rtn = "월요일";
			return rtn;
		case 2:
			rtn = "화요일";
			return rtn;
		case 3:
			rtn = "수요일";
			return rtn;
		case 4:
			rtn = "목요일";
			return rtn;
		case 5:
			rtn = "금요일";
			return rtn;
		case 6:
			rtn = "토요일";
			return rtn;
		default:
			rtn = "일요일";
			return rtn;
	}
}

