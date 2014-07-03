$.getScript("resources/json.min.js", function(){

	$('#getGoogleRest').click(function() {
		var bookURL = "https://www.googleapis.com/books/v1/volumes?q=".concat($('#title').val());
		//alert(bookURL);
		$.ajax({
			type : "GET",
			dataType : "charset=utf-8", 
			url : bookURL,
			success : function(data) {
				//alert(data);
				$("#googleBooksData").val(data);
			}
		});
	});
	//https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor  .concat("+inauthor");
	jQuery(function($) {
		  
		  $('#authorForm').submit(function() {
			var bookURL = "https://www.googleapis.com/books/v1/volumes?q=".concat($('#title').val()).concat("+intitle");
			//alert(bookURL);
			$.ajax({
				type : "GET",
				dataType : "charset=utf-8", 
				url : bookURL,
				success : function(data) {
					//alert(data);
					$("#googleBooksData").val(data);
				}
			});
		  });
	});
});
