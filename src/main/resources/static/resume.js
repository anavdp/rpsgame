$(document).ready(function() {
	$('#resumeTable').DataTable({
		"paging": false,
		"ordering": false,
		"info": false,
		"searching": false,
		"ajax": "/gameInfo",
		"columns": [
			{ "data": "label" },
			{ "data": "value" }]

	});

});