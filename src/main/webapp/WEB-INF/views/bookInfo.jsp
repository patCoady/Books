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
			<th>Publishers</th>
			<th>Publish Date</th>
			<th>Picture</th>
		</tr>
		<tr>
			<td><c:forEach items="${info.details.authors}" var="author">
					<div>${author.name}</div>
				</c:forEach></td>

			<td>${info.details.title}</td>
			<td>${info.details.number_of_pages}</td>
			<td><c:forEach items = "${info.details.publishers}" var ="publisher">
				<div>${publisher}</div>
			</c:forEach></td>
			<td>${info.details.publish_date}</td>
			<td><img src = "${info.thumbnail_url}"/></td>


		</tr>

	</table>
	<h4>Find out what some smart fuckers thought</h4>
	<c:forEach items="${iDream.book.critic_reviews}" var ="review">
		<p>${review.source} gave this fucking book, ${star_rating} stars that a lot(or very few) stars! </p>
		<p>	In detail this fucker said: ${review.snippet} </p>
		<p> <a href="${review.review_link }"> Read the whole review here</a></p>
	</c:forEach>
	<c:forEach items ="${iDream.book.unrated_critic_reviews}" var="review">
		<p>${review.source} had some stuff to say about this book </p>
		<p>In detail this fucker said: ${review.snippet} </p>
		<p> <a href="${review.review_link }"> Read the whole review here</a></p>
	</c:forEach>
</body>
</html>