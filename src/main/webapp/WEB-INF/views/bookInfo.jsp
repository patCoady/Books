<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fucking information</title>
</head>
<body>
	<h3>Educate your ignorant ass</h3>
	<h4>Info</h4>
	<table>
		<tr>
			<th>Author</th>
			<th>Title</th>
			<th>#Pages</th>
			<th>Subjects</th>
			<th>Excerpts</th>
			<th>Ebook</th>
			<th>Features</th>
			<th>Picture</th>
		</tr>
		<tr>
			<td>${info.details.title}</td> <!--List-->
			<td>${info.details.title}</td>
			<td>${info.details.number_of_pages}</td>
			<%-- <td>${info.details.info_url}</td> <!--LIST-->
			<td>${info.details.info_url}</td><!--else where-->
			<td>${info.details.info_url}</td><!--else where-->
			<td>${info.details.info_url}</td><!--else where-->
			<td>${info.details.info_url}</td><!--else where-->
 --%>
		</tr>

	</table>
</body>
</html>