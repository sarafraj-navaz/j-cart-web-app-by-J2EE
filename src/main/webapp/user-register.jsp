<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <% String msgPass = (String)request.getAttribute("passwordMessage"); %>
   
   <% if(msgPass != null) { %>
   
   <h4><%=msgPass %></h4>
     <%} %>
	<div>
	<jsp:include page="home-buttom.jsp"></jsp:include>
		<div>
			<form action="userRegister" method="post">
				<label for="">userName</label><br> <input type="text"
					name="userName" placeholder="userName"><br> <label
					for="">UserEmail</label><br> <input type="email"
					name="userEmail" placeholder="email"><br> <label
					for="">UserPhone</label><br> <input type="tel"
					name="userPhone" placeholder="UserPhone"><br> <label
					for="">UserPassword</label><br> <input type="password"
					name="userPassword" placeholder="password"><br> <label
					for="">UserAddress</label><br> <input type="text"
					name="userAddress" placeholder="userAddress"><br> <input
					type="submit" value="Signup">
			</form>
		</div>
	</div>
</body>
</html>