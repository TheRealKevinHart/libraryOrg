/**
 * 
 */

$('document').ready(function(){	
	$('.table .btn-warning').on('click',function(event){	
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(book, status){
			$('#idEdit').val(book.id);
			$('#titleEdit').val(book.title);
			$('#authorEdit').val(book.author);
		});
		
		$('#editModal').modal();				
	});
	
	$('table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
	});
	
});