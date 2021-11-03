$(document).ready(
	function() {
		$('.summernote').summernote('reset');
		$('#insert-timt-div').hide();
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

