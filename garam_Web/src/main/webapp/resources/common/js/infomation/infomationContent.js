$(document).ready(
	function() {

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

function fn_deleteContent(no) {
	var check = confirm("삭제하시겠습니까?");

	console.log("qdwqwddq  " + check);

	if (check) {
		var url = "/infomation/infomationdDelete";
		url = url + "?no=" + no;
		location.href = url;
	}
}