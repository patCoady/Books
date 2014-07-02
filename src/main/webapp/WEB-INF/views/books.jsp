<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/getBookInfo.js" />"></script>
<title>Books</title>
</head>
<body>
	<h3>Look at all this fucking knowlege</h3>
	
         
	<table class="booksInfo">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Published Data</th>
			<th>View Info</th>
		</tr>
		<c:forEach items="${books.items}" var="book">
			<tr>
				<td>${book.volumeInfo.title}</td>
				<td>${item.authors}</td> <!--DNW-->
				<td>${book.volumeInfo.publishedDate}</td>
				<td>
					<form name ="bookInfo" action="info" method ="get">
						<!--Get the ISBN numbers for book-->
						<c:forEach items="${book.volumeInfo.industryIdentifiers}" var = "ISBN">
							<input id = "${ISBN.type}-${book.id}" type ="hidden" value = "${ISBN.identifier}"/>
						</c:forEach>
						
						<input type ="hidden" id ="bookInfo-${book.id}"/>
						<button type = "submit">View Info</button>
						<button type ="button" id="getREST-${book.id}">Get Rest stuff</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>