var bookId;

$.getScript("resources/json.min.js", function(){
	mycallback = function(data){
		var dataString = JSON.stringify(data);
		$("#openLibInfo-".concat(bookId)).val(dataString);
		//alert("GOT DATA");
		
		};
		
		
		
//https://api.bookshare.org/book/isbn/9780547539638/format/json?api_key=3mkbgpcwnkmu9dk4ssgzzds3
function getBookShare(bookShareUrl){
	alert("woo");
	$.ajax({
		  url: 'https://api.bookshare.org/book/isbn/9780547539638/format/json?api_key=3mkbgpcwnkmu9dk4ssgzzds3',
		  dataType: "jsonp",
		  jsonpCallback: function() {
		    alert('JSONP call succeeded!');
		  }
		});
};		
//I Dream review Rest
function iDreamReview(iDreamUrl) {
	$.ajax({
		type : "GET",
		dataType : "charset=utf-8", 
		url : iDreamUrl,
		success : function(data) {
			/*alert(data);*/
			$("#iDreamInfo-".concat(bookId)).val(data);
		}
	});
}
function iDreamFeature(iDreamUrl) {
	$.ajax({
		type : "GET",
		dataType : "charset=utf-8", 
		url : iDreamUrl,
		success : function(data) {
			$("#iDreamFeatureInfo-".concat(bookId)).val(data);
		}
	});
}

$("button").click(function() {
	    var splitBtnId = this.id.split("-");
	    if(splitBtnId[0] == "getREST"){
	    	bookId=splitBtnId[1];
	    	
	    	//ISBN_13
	    	var isbn = document.getElementById('ISBN_13-'.concat(splitBtnId[1])).value;
	    	var openLibUrl = "https://openlibrary.org/api/books?bibkeys=ISBN:".concat(isbn).concat("&jscmd=details").concat("&callback=mycallback");
	    	//var bookShareUrl = "https://api.bookshare.org/book/isbn/9780547539638/format/json?api_key=3mkbgpcwnkmu9dk4ssgzzds3";
	    	var iDreamUrl = "http://idreambooks.com/api/books/reviews.json?q=".concat(isbn).concat("&key=96e642dbfef07c581689d3cc0e61bc712fb9c682");
	    	var iDreamFeatureUrl ="http://idreambooks.com/api/books/show_features.json?".concat(isbn).concat("&key=96e642dbfef07c581689d3cc0e61bc712fb9c682");
	    	
	    	//getBookShare(bookShareUrl);
	    	iDreamReview(iDreamUrl);
	    	iDreamFeature(iDreamFeatureUrl);
	    	$.loadScript(openLibUrl);
	    	alert("DataLoaded");
	    	//"https://openlibrary.org/api/books?bibkeys=ISBN:0451526538&callback=mycallback"
	    }
	});
//JSONP scriptloading
jQuery.loadScript = function (url) {
    jQuery.ajax({
        url: url,
        dataType: 'script',
        async: true
    });
};

//Disable all buttons with out a ISBN number
var inputs = document.getElementsByTagName("input");
for (var i = 0; i < inputs .length; i++) {
	var idSplit = inputs[i].id.split('-');
	if(idSplit[0] == "OTHER"){
		document.getElementById("getREST-".concat(idSplit[1])).disabled = true;
		document.getElementById("submit-".concat(idSplit[1])).disabled = true;
		document.getElementById("submit-".concat(idSplit[1])).innerHTML = "NO ISBN";
	}
}

});
