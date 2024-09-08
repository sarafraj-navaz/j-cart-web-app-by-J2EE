package com.jsp.jcart_web_app.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.ProductOwnerDao;
import com.jsp.jcart_web_app.dto.ProductOwner;

/**
 * we have to write about this class
 * @author Sarfraj
 *
 */
public class ProductOwnerService {
	
	
	ProductOwnerDao dao =new ProductOwnerDao();
	
	public ProductOwner saveProductOwnerService(ProductOwner productOwner) {
		
		
	   if((productOwner.getPassword().length() >=8) && (productOwner.getPassword().length()<=15)) {
		   
		   Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher(productOwner.getPassword());
		   Matcher number = Pattern.compile("[0-9]").matcher(productOwner.getPassword());
		   Matcher special = Pattern.compile("[@#$%^&*!>?<:?><]").matcher(productOwner.getPassword());
		   
		   if((alphabet.find()) && (number.find()) && (special.find())) {
			   
			   return dao.saveProductOwnerDao(productOwner);
		   }
		   else {
			   return null;
		   }
	   }
	return null;
	}
	
	/**
	 * login method
	 */

	
	public ProductOwner loginWithEmailPasswordService(String email) {
		
		return dao.loginWithEmailPassword(email);
	}

	/*
	 * verify product owner from no to yes
	 */
	
	public int verifyProductOwnerByIdService(int productOwnerId) {
		
		
		return dao.verifyProductOwnerByIdDao(productOwnerId);
	}
	/*
	 * verify product owner from yes to no
	 */

	public int unverifyProductOwnerByIdService(int productOwnerId) {
		return dao.unverifyProductOwnerByIdDao(productOwnerId);
	}
}
