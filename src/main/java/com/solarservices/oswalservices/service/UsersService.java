package com.solarservices.oswalservices.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solarservices.oswalservices.dao.UsersDao;
import com.solarservices.oswalservices.entity.Users;

@Service
public class UsersService {

	@Autowired
	UsersDao UsersDao;

	public List<Users> getUsers() {
		return UsersDao.getUsers();
	}

	public Users saveUsers(Users Users) throws SQLException { 
		return UsersDao.saveUsers(Users);
	}

	public Users checkUser(Users Users) throws SQLException {
		return UsersDao.checkUser(Users);
	}
}
