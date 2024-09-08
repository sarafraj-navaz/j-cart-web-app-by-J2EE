package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.ProductOwner;
import com.jsp.jcart_web_app.service.ProductOwnerService;
@WebServlet("/ownerLogin")
public class ProductOwnerLoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("OwnerEmail");
		String password = req.getParameter("OwnerPassword");
		
		
		ProductOwner owner = new ProductOwnerService().loginWithEmailPasswordService(email);
		
		/*
		 * if (owner != null) {
		 * 
		 * if (owner.getPassword().equals(password)) {
		 * 
		 * req.getRequestDispatcher("owner-home.jsp").forward(req, resp);
		 * 
		 * }else { req.setAttribute("incorrectOwnerPassword",
		 * "please enter the valid password");
		 * req.getRequestDispatcher("owner-login.jsp").forward(req, resp); } } else {
		 * 
		 * req.setAttribute("incorrectOwnerEmail", "please the valid email");
		 * req.getRequestDispatcher("owner-login.jsp").forward(req, resp); }
		 */
		
	       if(owner!=null) {
				
			if(owner.getPassword().equals(password)) {
				
				if((owner.getVerify().equals("yes"))) {
					
					req.getRequestDispatcher("owner-home.jsp").forward(req, resp);
				}else {
					req.setAttribute("unverified", "you are not verified please contact with admin team");
					req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
				}
				
			}else {
				req.setAttribute("incorrectOwnerPass", "please pass correct password");
				req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
			}
			
		}else {
			req.setAttribute("incorrectOwnerEmail", "please pass correct email");
			req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
		}
	}

}
