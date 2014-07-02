var bookId;

$.getScript("resources/json.min.js", function(){
	mycallback = function(data){
		  alert(JSON.stringify(data));
		};
$("button").click(function() {
	    var splitBtnId = this.id.split("-");
	    if(splitBtnId[0] == "getREST"){
	    	bookId=splitBtnId[1];
	    	//ISBN_13
	    	var isbn = document.getElementById('ISBN_13-'.concat(splitBtnId[1])).innerHTML;
	    	var url = "https://openlibrary.org/api/books?bibkeys=ISBN:".concat(isbn).concat("&callback=mycallback");
	    	
	    	$.loadScript(url);
	    	//"https://openlibrary.org/api/books?bibkeys=ISBN:0451526538&callback=mycallback"
	    }
	});

jQuery.loadScript = function (url) {
    jQuery.ajax({
        url: url,
        dataType: 'script',
        async: true
    });
};
});
