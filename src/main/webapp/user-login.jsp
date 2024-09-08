<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

     <%
     
     String emailMessage= (String)request.getAttribute("incorrectPassword");
     String passwordMessage= (String)request.getAttribute("incorrectEmail");
     
     %>
     <%if(emailMessage != null) { %>
     
     <h3  style="color: red"><%=emailMessage %></h3>
     
     
     <%} %>
     <%if((passwordMessage) != null) { %>
     
         <h3 style="color: red"><%=passwordMessage %></h3>
     <%} %>
    <div class="inner-block">
        <form action="loginUser" method="post">
          

                <p>
                    <input type="text" placeholder="user name" name="userName">
                </p>
                <p>
                    <input type="password" placeholder="at least 8 characters" name="userPassword">
                </p>
                <p>
                    <select name="dropdown" id="">
                        <option value="Login with Admin">Login with Admin</option>
                        <option value="Login with Product Owner">Login with Product Owner</option>
                    </select>
                </p>
                <p>
                    <input type="submit" value="Login">
                    <button><a href="user-register.jsp">Sign-up</a></button>
                </p>
        </form>
    </div>
</body>
</html>