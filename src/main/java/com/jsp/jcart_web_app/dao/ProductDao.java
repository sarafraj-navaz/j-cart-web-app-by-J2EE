package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Product;

public class ProductDao {
	
	Connection connection= UserConnection.getUserConnection();
	
	/*
	 * insert products items
	 */
	public Product saveProductDaoInsert(Product product) {
		
		String productRegisterQuery ="insert into products(name,type,weartype,price,image) values(?,?,?,?,?)";
		
		try {
			PreparedStatement  preparedStatement=connection.prepareStatement(productRegisterQuery);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setString(2, product.getProductType());
			preparedStatement.setString(3, product.getProductWearType());
			preparedStatement.setDouble(4, product.getProductPrice());
			preparedStatement.setBlob(5,product.getInputStream());
			preparedStatement.execute();
			return product;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
		
	}
	
	public List<Product>  getAllProductData(){
		
		String displayProductDataQuery ="select * from products";
		
		try {
			ResultSet resultSet =connection.prepareStatement(displayProductDataQuery).executeQuery();
			
			
			List<Product> products = new ArrayList<Product>();
			
			while(resultSet.next()) {
				products.add(new Product(resultSet.getInt("id"),resultSet.getString("name"), 
						resultSet.getString("type"),
						resultSet.getString("weartype"), resultSet.getDouble("price")));
			}
			return products;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
