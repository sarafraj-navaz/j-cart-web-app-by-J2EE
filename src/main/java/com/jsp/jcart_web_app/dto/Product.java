package com.jsp.jcart_web_app.dto;

import java.io.InputStream;

public class Product {

	private int productId;
	private String productName;
	private String productType;
	private String productWearType;
	private double productPrice;
	private String verify;
	private InputStream inputStream;
	
	
	
	
	
	
	public Product() {
		super();
	}


   
	public Product(String verify) {
		super();
		this.verify = verify;
	}

  

	public String getVerify() {
		return verify;
	}



	public void setVerify(String verify) {
		this.verify = verify;
	}



	public Product(int productId, String productName, String productType, String productWearType, double productPrice,
			String verify) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
		this.verify = verify;
	}



	public Product(String productName, String productType, String productWearType, double productPrice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
	}



	public Product(int productId, String productName, String productType, String productWearType, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
	}

	
	public Product(String productName, String productType, String productWearType, double productPrice,
			InputStream inputStream) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
		this.inputStream = inputStream;
	}



	public InputStream getInputStream() {
		return inputStream;
	}



	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}



	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductWearType() {
		return productWearType;
	}
	public void setProductWearType(String productWearType) {
		this.productWearType = productWearType;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}	
}
