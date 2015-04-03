<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:out value="${applicationScope.productList[3]}" /> --%>
	
<%-- 	Hello <b><%= request.getParameter("item") %></b>! --%>
	
	<%int no = Integer.parseInt(request.getParameter("item")); %>
	<c:out value="${applicationScope.productList[0]}"/>

</body>
</html>