$(document).on(
	'click',
	'#new-info',
	function() {
		$('.summernote').summernote('reset');
		$('#insert-time').hide();
	}
);

