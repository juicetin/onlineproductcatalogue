<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- This is the template of a jsp for displaying the result -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Survey Result -- JSTL</title>
<link rel="stylesheet" type="text/css" href="css/surveystyle.css"
	media="screen" />

</head>
<body>
	
	<h3> ${requestScope.info}</h3>
	<h4>Current Survey Results:</h4>

	<h5>For Female Respondents</h5>

	<div align="left">
		<table border="0" cellpadding="1">

			<tr>
				<td><c:forEach var="product"
						items="${applicationScope.productList}">
			${product}:
			<br />
					</c:forEach></td>

				<td><c:forEach var="count" items="${applicationScope.fPhones}">
			${count}
			<br />
					</c:forEach></td>
			</tr>

		</table>
	</div>

	<h5>For Male Respondents</h5>

	<div align="left">
		<table border="0" cellpadding="1">

			<tr>
				<td>
				<c:forEach var="product"
						items="${applicationScope.productList}">
			${product}:
			<br />
					</c:forEach></td>
					
				<td><c:forEach var="count" items="${applicationScope.mPhones}">
			${count}
			<br />
					</c:forEach></td>
			</tr>

		</table>
	</div>



</body>
</html>