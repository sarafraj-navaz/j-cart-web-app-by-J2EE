<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%--    <% 
   String incorrectEmail =(String)request.getAttribute("incorrectOwnerPassword");
   
   String incorrectPassword =(String)request.getAttribute("incorrectOwnerEmail");
   
   %>
			<%if(incorrectEmail != null){ %>
			
			   <span  style="color:red"><%= incorrectEmail%></span>
			<%} %>
			<%if(incorrectPassword != null){ %>
			
			<span style="color: red"><%=incorrectPassword %></span>
			
			<%} %> --%>
			
	<%
	String incorrectEmail = (String) request.getAttribute("incorrectOwnerEmail");

	String incorrectPassword = (String) request.getAttribute("incorrectOwnerPass");
	
	String verify = (String) request.getAttribute("unverified");
	%>
	<marquee><h3><i>Welcome to Owner Login Page</i></h3></marquee>
		
	<%if(incorrectEmail!=null){ %>
		
		<span style="color: red"><%=incorrectEmail%></span>
	
	<%} %>
	<%if(incorrectPassword!=null){ %>
		
		<span style="color: red"><%=incorrectPassword%></span>
	
	<%} %>
	<%if(verify!=null){ %>
		
		<span style="color: red"><%=verify%></span>
	
	<%} %>	
	<jsp:include page="home-buttom.jsp"></jsp:include>
	<h1>owner login</h1>
	        <form action="ownerLogin"  method="post">
				<label for="">OwnerEmail</label><br> <input type="email"
				placeholder="type your email" name="OwnerEmail"><br> <label
				for="">Password</label><br> <input type="password"
				placeholder="type your password" name="OwnerPassword"><br>

			<input type="submit" value="login"><br>
			<a href="owner-register.jsp">Signup</a>
		</form>
	</div>
</body>
</html>