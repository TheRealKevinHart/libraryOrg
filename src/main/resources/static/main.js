/**
 * 
 */

$('document').ready(function() {
	$('.table .btn').on('click',function(event) {
		
		event.preventDefault();
		
		$('#editModal').modal();
	});
	
	$('table #deleteButton').on('click',function(event) {
		$('#deleteModal').modal();
	});
	
});