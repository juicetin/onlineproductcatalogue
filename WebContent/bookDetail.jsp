<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${applicationScope.productList[param.item]}</title>
<link rel="stylesheet" type="text/css" href="css/surveystyle.css"
	media="screen" />
</head>
<body>
		<table border="2" cellpadding="10">
			<tr>
				<td valign="top">
					<img src="${applicationScope.images[param.item]} }"/>
					
					<!-- Show rating options only when user hasn't rated in current session -->
					<c:set var="item" value="${param.item}" />
					<c:if test="${empty sessionScope[item]}">
					<p>Rating:<p>
					<form method="POST" action="products">
					<input type='hidden' name='item' value='${param.item}'/>
					<label> <input type="radio" name="rate"	value="1" />1</label><p>
					<label> <input type="radio" name="rate"	value="2" />2</label><p>
					<label> <input type="radio" name="rate"	value="3" />3</label><p>
					<label> <input type="radio" name="rate"	value="4" />4</label><p>
					<label> <input type="radio" name="rate"	value="5"checked="checked"/>5</label><p>
					<p>
					<input type="submit" value="Rate" />
					</form>
					</c:if>
					
					<!-- Show user rating only if they have rated for a particular item -->
					<p>
					<c:set var="item" value="${param.item}" />
					<c:if test="${!empty sessionScope[item]}">
					<b>Your Rating: </b> <c:out value="${applicationScope.userRatings[param.item]}" /><p>
					</c:if>
					<b>Average Rating: </b>	<c:out value="${applicationScope.averages[param.item]}" /><p>
					<p>
					
					<ul>
						<li>Rate 5: <c:out value="${applicationScope.ratings[param.item][4]}" /></li>
						<li>Rate 4: <c:out value="${applicationScope.ratings[param.item][3]}" /></li>
						<li>Rate 3: <c:out value="${applicationScope.ratings[param.item][2]}" /></li>
						<li>Rate 2: <c:out value="${applicationScope.ratings[param.item][1]}" /></li>
						<li>Rate 1: <c:out value="${applicationScope.ratings[param.item][0]}" /></li>
					</ul>
				</td>
				<td valign="top">
					<b>Title: </b> <c:out value="${applicationScope.productList[param.item]}" /><p>
					<b>Author: </b> <c:out value="${applicationScope.authors[param.item]}" /><p>
					<b>Pages: </b> <c:out value="${applicationScope.pages[param.item]}" /><p>
					<b>Price: </b> <c:out value="${applicationScope.prices[param.item]}" /><p>
					<b>Language: </b> <c:out value="${applicationScope.languages[param.item]}" /><p>
					<b>ISBN10: </b> <c:out value="${applicationScope.ISBN10[param.item]}" /><p>
					<b>ISBN13: </b> <c:out value="${applicationScope.ISBN13[param.item]}" /><p>
				</td>
			</tr>
		</table>
		<p><p>
		
		<a href="/bookCatalogue.jsp">Back to book catalogue</a><p><p>
</body>
</html>