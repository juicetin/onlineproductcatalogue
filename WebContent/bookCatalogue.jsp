<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consumer Next Mobile Survey -- JSTL and EL</title>
<link rel="stylesheet" type="text/css" href="css/surveystyle.css"
	media="screen" />
</head>
<body>
	<h2>Catalogue</h2>

	<c:forEach var="product" items="${applicationScope.productList}"
		varStatus="productCount">
		<form method="GET" action="products">
			<a href="bookDetail.jsp">${product}</a>
		</form>
		<p>
	</c:forEach>

</body>
</html>