$(document).ready(
	function() {
		fn_ShowReplyList($('#infoContent-head').val());
	}
);

$(document).on(
	'click',
	'#new-info',
	function() {
		//		$('.summernote').summernote('reset');
		//		$('#insert-time').hide();
	}
);

function fn_CompleteContent(no) {
	var url = "/infomationComplete/complete";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var paramData = JSON.stringify({
		"num1Int": no
	});

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',

		success: function(r) {
			var url = "/infomation/infomationContent";
			url = url + "?no=" + no;
			location.href = url;
		}
	});
}

function fn_UndoCompleteContent(no) {
	var url = "/infomationComplete/undoComplete";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var paramData = JSON.stringify({
		"num1Int": no
	});

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',

		success: function(r) {
			var url = "/infomation/infomationContent";
			url = url + "?no=" + no;
			location.href = url;
		}
	});
}

function fn_editContent(no) {
	var url = "/infomation/infomationEdit";
	url = url + "?no=" + no;
	url = url + "&mode=edit";
	location.href = url;
}

function fn_deleteContent(no) {
	var check = confirm("삭제하시겠습니까?");

	if (check) {
		var url = "/infomation/infomationdDelete";
		url = url + "?no=" + no;
		location.href = url;
	}
}

function fn_ShowReplyList(no) {
	var url = "/infomationReply/getInfomationList";
	var headers = {
		"Content-Type": "application/json",
		"X-HTTP-Method-Override": "POST"
	};

	var paramData = JSON.stringify({
		"num1Int": no
	});

	$.ajax({
		url: url,
		headers: headers,
		type: 'POST',
		data: paramData,
		dataType: 'json',

		success: function(r) {

			//			<h4>댓글</h4>
			//					<div class="infoContent-reply-body" id="replyList">
			//						<div class="infoContent-reply-body-item">부장 홍길동</div>
			//						<div class="infoContent-reply-body-item">오호 신기한데요???</div>
			//						<div class="infoContent-reply-body-item">
			//							<div>작성일 2021.11.05 19:05:00</div>
			//							<div>|</div>
			//							<div>수정일 2021.11.05 19:05:00</div>
			//							<div>|</div>
			//							<div>
			//								<a>답글쓰기</a>
			//							</div>
			//						</div>
			//					</div>
			//					<hr>

			var htmls = '';
			htmls = '<h4>댓글</h4>';
			if (r.length < 1) {
				htmls = '<h4>댓글없음</h4>';
			} else {
				for (var i = 0; i < r.length; i++) {
					htmls += '<div class="infoContent-reply-body">';
					if (r[i].depth > 0) {
						htmls += '<div class="infoContent-reply-body-item"><i class="fas fa-reply fa-rotate-180"></i></div>';
					}
					htmls += '<div class="infoContent-reply-body-in">';
					htmls += '<div class="infoContent-reply-body-in-item">' + r[i].name + '</div>';
					htmls += '<div class="infoContent-reply-body-in-item">' + r[i].content + '</div>';
					htmls += '<div class="infoContent-reply-body-in-item">';
					htmls += '<div>작성일&nbsp;' + r[i].insert_date_Ch + '&nbsp;</div>';
					htmls += '<div>|</div>';
					htmls += '<div>수정일&nbsp;' + r[i].edit_date_Ch + '</div>';
					htmls += '<div>|</div>';
					htmls += '<div>';
					htmls += '<a>답글쓰기</a>';
					htmls += '</div>';
					htmls += '</div>';
					htmls += '</div>';
					htmls += '</div>';
					htmls += '<hr>';
				}
			}
			$("#replyList").html(htmls);
		}
	});
}