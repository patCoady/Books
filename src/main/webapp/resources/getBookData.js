$.getScript("resources/json.min.js", function(){

	$('#getGoogleRest').click(function() {
		var bookURL = "https://www.googleapis.com/books/v1/volumes?q=".concat($('#title').val()).concat("+intitle");
		alert(bookURL);
		$.ajax({
			type : "GET",
			dataType : "charset=utf-8", 
			url : bookURL,
			success : function(data) {
				$("#googleBooksData").val(data);
			}
		});
	});
});
