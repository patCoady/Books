<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<script type="text/javascript" src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/getBooks.js" />"></script>
</head>
<body>
	<h1>Fucking Book Finder!</h1>
	<button id ="getGoogleRest">google</button>

	<form action = "author" id ="authorForm" name = "bookFinder" method = "post">
		<fieldset>
			<label>Find a fucking book by title</label>
			<input type="text" id="title" />
			<input type ="hidden" id = "googleBooksData" name ="googleBooksData"/>
			<button type="submit">Find me some fucking books!</button>
		</fieldset>
	</form>


</body>
</html>
