package com.solarservices.oswalservices.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.solarservices.oswalservices.entity.Users;
import com.solarservices.oswalservices.service.UsersService;

@RestController
@RequestMapping("/oswalservices/users")
@CrossOrigin("*")
public class UsersController {
	@Autowired
	UsersService UsersService;

	@GetMapping("/getAll")
	public List<Users> getUsers() {
		return UsersService.getUsers();
	}

	@PostMapping("/save")
	public Users saveUsers(@RequestBody Users Users) throws SQLException {

		return UsersService.saveUsers(Users);
	}

	@PostMapping("/checkUser")
	public ResponseEntity<Map<String, Object>> checkUser(@RequestBody Users Users) throws SQLException {
		Users isValid = UsersService.checkUser(Users);

		Map<String, Object> response = new HashMap<>();

		if (isValid != null) {
			response.put("status", "success");
			response.put("user", isValid);
		} else {
			response.put("status", "notSuccess");
		}
		return ResponseEntity.ok(response);

	}
}
