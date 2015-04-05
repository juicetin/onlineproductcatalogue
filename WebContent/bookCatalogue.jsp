<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Catalogue</title>
<link rel="stylesheet" type="text/css" href="css/surveystyle.css"
	media="screen" />
</head>
<body>
	<h2>Catalogue</h2>
	<form method="POST" action="products">
	<!-- Table to display all catalogue items -->
	<table border="1" cellpadding="10">
		<c:forEach var="product" items="${applicationScope.productList}"
			varStatus="productCount">
				
				<!-- Start new row to create grid table layout -->
				<c:if test="${productCount.index % 2 == 0 }"><tr></tr></c:if>
				<td>
				
				<!-- All item details -->
				<c:url var="myURL" value="/bookDetail.jsp">
					<c:param name="item" value="${productCount.index }" />
				</c:url>
				<h3><a href="${myURL}">${product}</a></h3><p>
				<a href="${myURL}"><img src="${applicationScope.images[productCount.index]} }"/></a><br>
				Price: <c:out value="${applicationScope.prices[productCount.index]}"/><br>
				Average Rating: <c:out value="${applicationScope.averages[productCount.index]}"/><br>
				Total Number of Ratings: <c:out value="${applicationScope.ratingCount[productCount.index] }"/><p>
				</td>
		</c:forEach>
	</table>
	</form>
</body>
</html>