package com.solarservices.oswalservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.DriverManager; 
import com.solarservices.oswalservices.entity.Users;
import com.solarservices.oswalservices.repo.UsersRepo;

@Component
public class UsersDao {
	@Autowired
	UsersRepo UsersRepo; 

	
	String url = "jdbc:mysql://junction.proxy.rlwy.net:29214/solarservices";
    String username = "root";
    String password = "HburqaJheEbPczwXyREVimuqIDLZdDRa"; 
    
	public List<Users> getUsers() {
		return UsersRepo.findAll();
	}

	public Users saveUsers(Users users) throws SQLException {

		String email = users.getEmail();
		String sql = "SELECT count(1) FROM users WHERE email = ?";

		try (Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement isPresent = conn.prepareStatement(sql)) {

			isPresent.setString(1, email);

			try (ResultSet rs = isPresent.executeQuery()) {
				if (rs.next()) {
					int count = rs.getInt(1);
					if (count > 0) {
						System.out.println("Email is already present. Please log in.");
						return null;
					}
				}
			}
			return UsersRepo.save(users);

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	} 
	public Users checkUser(Users users) throws SQLException {
	    String email = users.getEmail();
	    String pass = users.getPassword(); 
	    String sql = "SELECT * FROM users WHERE email = ?";
 
	    try (Connection conn =  DriverManager.getConnection(url, username, password);
	         PreparedStatement stmt = conn.prepareStatement(sql)) {

	        stmt.setString(1, email);
	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {
	                String storedPassword = rs.getString("password"); 
	                if (pass.equals(storedPassword)) { 
	                    users.setUserId(rs.getInt("user_id"));
	                    users.setOrgId(rs.getInt("org_id"));
	                    users.setfName(rs.getString("f_name"));
	                    users.setmName(rs.getString("m_name"));
	                    users.setlName(rs.getString("l_name"));
	                    users.setVillageName(rs.getString("village_name"));
	                    users.setUserName(rs.getString("user_name"));
	                    users.setEmail(rs.getString("email"));
	                    return users;  
	                }
	            }
	        }
	    }
	    return null; 
	}


}
