<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@page import="com.jsp.jcart_web_app.dto.ProductOwner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Welcome to owner Property.......</h2>
    <a href="add-product-owner.jsp"><button>AddProduct</button></a><br>
     
     <%
         ProductDao  dao =  new ProductDao();
       
     %>
     	<table border="2px">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>Type</th>
			<th>WearType</th>
			<th>Price</th>
			<th>Status</th>
			<th>verifynow</th>
		</tr>
		
	<% for(Product product :dao.getAllProductData()) { %>	
		<tr>
			<td><%=product.getProductId() %></td>
			<td><%=product.getProductName() %></td>
			<td><%=product.getProductType() %></td>
			<td><%=product.getProductWearType() %></td>
			<td><%=product.getProductPrice() %></td>
			<td><%=product.getVerify() %></td>
			
		</tr>
	<%}%>
	</table>  
   
   
    
</body>
</html>