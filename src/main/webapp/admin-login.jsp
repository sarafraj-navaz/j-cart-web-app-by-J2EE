<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
      ::placeholder{
        color: aqua;
      }
      body{
        border: none;
        margin: 0%;
        padding: 0%;
      }
      .main{
        display: flex;
        justify-content: center;
        justify-items: center;
      }
    </style>
</head>
<body>

   
   <% 
   String incorrectEmail =(String)request.getAttribute("incorrectadminEmail");
   
   String incorrectPassword =(String)request.getAttribute("incorrectadminPassword");
   
   %>
	<div class="main">
		<form action="adminLogin"  method="post">
			<marquee behavior="" direction="">
				<h3>
					<i>Welcome To Admin Login</i>
				</h3>
			</marquee>
			<%if(incorrectEmail != null){ %>
			
			   <span  style="color:red"><%= incorrectEmail%></span>
			<%} %>
			<%if(incorrectPassword != null){ %>
			
			<span style="color: red"><%=incorrectPassword %></span>
			
			<%} %>
			
			<jsp:include page="home-buttom.jsp"></jsp:include>
			<label for="">AdminEmail</label><br> <input type="email"
				placeholder="type your email" name="adminEmail"><br> <label
				for="">Password</label><br> <input type="password"
				placeholder="type your password" name="adminPassword"><br>

			<input type="submit" value="login">
		</form>
	</div>
</body>
</html>