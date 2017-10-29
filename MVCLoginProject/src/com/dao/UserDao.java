package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.business.exception.UserNotFoundException;
import com.model.User;

public class UserDao {

	/**
	 * 
	 * @param userName
	 * @return
	 * @throws SQLException
	 */
	public User getUser(String userName) throws UserNotFoundException{
		Connection con = null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement ps = con.prepareStatement("select * from user where user_name = ?");
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				User user = new User();
				user.setName(rs.getString("name"));
				user.setPass(rs.getString("pass"));
				user.setUserName(rs.getString("user_name"));
				return user;
			} else {
				throw new UserNotFoundException();
			}
		} catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
