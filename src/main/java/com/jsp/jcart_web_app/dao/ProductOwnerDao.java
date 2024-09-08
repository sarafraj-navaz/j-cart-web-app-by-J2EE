package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.ProductOwner;

public class ProductOwnerDao {

	Connection connection = UserConnection.getUserConnection();

	public ProductOwner saveProductOwnerDao(ProductOwner productOwner) {

		String insertQuery = "insert into owner(name,email,password,phone,verify) values(?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			preparedStatement.setString(1, productOwner.getName());
			preparedStatement.setString(2, productOwner.getEmail());
			preparedStatement.setString(3, productOwner.getPassword());
			preparedStatement.setLong(4, productOwner.getPhone());
			preparedStatement.setString(5, "no");

			preparedStatement.execute();

			return productOwner;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ProductOwner loginWithEmailPassword(String email) {

		String selectEmailQuery = "select * from owner where email =?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(selectEmailQuery);

			preparedStatement.setString(1, email);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {

				return new ProductOwner(rs.getString("email"), rs.getString("password"), rs.getString("verify"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * public List<ProductOwner> displayAllProductOwner(){
	 * 
	 * String display ="select * from owner";
	 * 
	 * try { PreparedStatement preparedStatement =
	 * connection.prepareStatement(display);
	 * 
	 * ResultSet resultSet = preparedStatement.executeQuery();
	 * 
	 * List<ProductOwner> owners = new ArrayList<ProductOwner>();
	 * while(resultSet.next()) {
	 * 
	 * owners.add(new ProductOwner(
	 * resultSet.getInt("id"),resultSet.getString("name"),
	 * resultSet.getString("email"), resultSet.getString("password"),
	 * resultSet.getLong("phone"), resultSet.getString("verfiy"))); } return owners;
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return null;
	 * 
	 * }
	 */

	public List<ProductOwner> displayAllProductOwnerDao() {
		try {
			ResultSet resultSet = connection.prepareStatement("SELECT * From owner").executeQuery();

			List<ProductOwner> owners = new ArrayList<ProductOwner>();

			while (resultSet.next()) {

				owners.add(new ProductOwner(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("email"), resultSet.getString("password"), resultSet.getLong("phone"),
						resultSet.getString("verify")));
			}
			return owners;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * verify product owner from no to yes
	 * 
	 * 
	 * public int verifyProductOwnerById(int productOwnerId) {
	 * 
	 * try {
	 * 
	 * return connection.createStatement().
	 * executeUpdate("update owner set verify='yes' where id="+productOwnerId);
	 * 
	 * } catch (Exception e) { // TODO: handle exception } return 0; }
	 */
	/*
	 * verify product owner from no to yes
	 */
	public int verifyProductOwnerByIdDao(int productOwnerId) {
		
		try {
			
			return connection.createStatement()
					.executeUpdate("update owner set verify='yes' where id="+productOwnerId);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	public int unverifyProductOwnerByIdDao(int productOwnerId) {
		
		try {
			
			return connection.createStatement()
					.executeUpdate("update owner set verify='no' where id="+productOwnerId);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}
}
