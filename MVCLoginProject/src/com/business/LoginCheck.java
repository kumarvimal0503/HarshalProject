package com.business;

import com.business.exception.UserNotFoundException;
import com.dao.UserDao;
import com.model.User;

public class LoginCheck {
	
	private UserDao userDao = new UserDao();
	
	
	public boolean checkLogin(String userName, String pass) throws UserNotFoundException {
		
		User user = userDao.getUser(userName);
		
		if( user == null){
			return false;
		}
		
		if(pass.equals(user.getPass())){
			return true;
		} else {
			return false;
		}
	}
	
	public User getUserInfo(String userName) throws UserNotFoundException{
		return userDao.getUser(userName);
	}
}
