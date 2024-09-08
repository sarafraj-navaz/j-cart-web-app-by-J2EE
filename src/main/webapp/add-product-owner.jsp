<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="add-product-owner"method="post" enctype="multipart/form-data">
            <label for="productName">ProductName</label><br>
      <input type="text" id="productName" placeholder="enter  the productName"name="productName"><br>
             <label for="productPrice">ProductPrice</label> <br>    
      <input type="number" id="productPrice" placeholder="enter  the productPrice" name="productPrice"><br>
            <label for="productType">ProductType</label><br>
            <select name="productType">
                 <option value="mens">Men</option>
                 <option value="womens">women</option>
                 <option value="kids">Kids</option>
                 
            </select><br>
                 <label for="productType">ProductWearType</label><br>
            <select name="productWearType">
                 <option value="pants">pants</option>
                 <option value="shirt">shirts</option>
                 <option value="jeans">jeans</option> 
            </select><br>
            <label>User Photo</label>
            <input type="file" name="photo" size="50"/>
            <input type="submit" value="addproducts"> 
    </form>
</body>
</html>