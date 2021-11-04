$(document).ready(
	function() {
		$('.summernote').summernote('reset');
		$('#insert-timt-div').hide();

		let dateElement = document.getElementById('insert-time');
		let date = new Date(new Date().getTime() - new Date().getTimezoneOffset() * 60000).toISOString().slice(0, -5);
		dateElement.value = date;
		console.log("aa12233   " + dateElement.value);
		dateElement.setAttribute("min", date);

		if (dateElement.value < date) {
			alert('현재 시간보다 이전의 날짜는 설정할 수 없습니다.');
			dateElement.value = date;
		}
	}
);


$('#check2-info').change(function() {
	var imChecked = $(this).is(":checked");

	if (imChecked) {
		$('#insert-timt-div').hide();
	} else {
		$('#insert-timt-div').show();
	}
});

$(document).on(
	'click',
	'#insert-btn',
	function() {
		var gradeCH = $('#check1-info').is(":checked");

		var gRade = 0;
		if (gradeCH) {
			gRade = 1;
		}

		var endDCH = $('#check2-info').is(":checked");

		if (!endDCH) {
			var endD = null;
			let dateElement = document.getElementById('insert-time');
			console.log("qdqd124123   " + dateElement.value);
			endD = getCalTimeInputJSPtoDB(String(dateElement.value));
			$('#date_end').val(endD);
		} else {
			$("#date_end").attr('disabled', 'disabled')
		}

		console.log("endD   " + endD);
		console.log("gRade   " + gRade);

		$('#grade').val(gRade);
		$('#name').val("사원 홍길동");

		$("#insert-form").submit();
	}
);

