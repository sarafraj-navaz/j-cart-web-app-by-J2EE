package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jsp.jcart_web_app.dto.Product;
import com.jsp.jcart_web_app.service.ProductService;

@WebServlet(value = "/add-product-owner")
@MultipartConfig(maxFileSize = 16177215)
public class AddProductController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("productName");
		String type =req.getParameter("productType");
		String wearType = req.getParameter("productWearType");
		double price =Double.parseDouble(req.getParameter("productPrice"));
		Part image =req.getPart("photo");
		
		new ProductService().saveProductService(new Product(name, type, wearType, price,image.getInputStream() ));
		
		req.getRequestDispatcher("owner-register.jsp").forward(req, resp);
		
		
	}

}
