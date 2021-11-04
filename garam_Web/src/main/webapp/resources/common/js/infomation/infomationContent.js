$(document).ready(
	function() {

	}
);

function fn_CompleteContent(no) {
	var url = "/infomation/infomationContent/infomationComplete";
	url = url + "?no=" + no;

	location.href = url;
}