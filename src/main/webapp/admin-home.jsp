<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="home-buttom.jsp"></jsp:include>
	<h2>Admin Dashboard</h2>
	<jsp:include page="verify-owner.jsp"></jsp:include>
	<jsp:include page="unverify-owner.jsp"></jsp:include>
</body>
</html>