<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to product owner Register area</h3>
	<jsp:include page="home-buttom.jsp"></jsp:include>
	<div>
		<form action="ownerRegister" method="post">
			<label for="">OwnerName</label><br>
			 <input type="text"name="ownerName" placeholder="ownerName"><br>
			 <label for="">OwnerEmail</label><br>
			 <input type="email"name="ownerEmail" placeholder="ownerEmail"><br>
			 <label for="">OwnerPassword</label><br>
			 <input type="password" name="ownerPassword" placeholder="ownerPassword"><br>
			 <label for="">OwnerPhone</label><br> <input type="tel" name="ownerPhone" placeholder="ownePhone"><br>
			 <input type="submit" value="Login">
		</form>
	</div>
</body>
</html>