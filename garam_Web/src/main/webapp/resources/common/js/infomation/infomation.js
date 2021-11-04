$(document).on(
	'click',
	'#new-info',
	function() {
		//		$('.summernote').summernote('reset');
		//		$('#insert-time').hide();
	}
);

function fn_contentView(no) {
	var url = "/infomation/infomationContent";
	url = url + "?no=" + no;

	location.href = url;
}