package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.User;

/**
 * 
 * @author Sarafraj
 *
 */
public class UserDao {
	
	
	Connection con = UserConnection.getUserConnection();
	
	public User saveUserDao(User user) {
		 
		String insertQuery ="insert into user(name,email,password,phone,address) values(?,?,?,?,?)";
		
		try {
			 PreparedStatement  preparedStatement= con.prepareStatement(insertQuery);
			 
			 preparedStatement.setString(1, user.getUserName());
			 preparedStatement.setString(2, user.getUserEmail());
			 preparedStatement.setString(3, user.getUserPassword());
			 preparedStatement.setLong(4, user.getUserPhone());
			 preparedStatement.setString(5, user.getUserAddress());
			   
			 preparedStatement.execute();
			 
			 return user;
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
  
		
	}
	

   /*
    * login page
    */
	public User loginWithUser(String userEmail) {
		
		String emailQuery = "select * from user where email=?";
		
		try {
			PreparedStatement preparedStatement = con.prepareStatement(emailQuery);
			
			preparedStatement.setString(1,userEmail);
			
			 ResultSet rs= preparedStatement.executeQuery();
			 
			 if(rs.next()) {
				 
				 return new User(rs.getString("email"), rs.getString("password"));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
