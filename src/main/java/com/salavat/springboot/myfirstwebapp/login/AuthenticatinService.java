package com.salavat.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatinService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("salavat");
		boolean isValidPassword = password.equalsIgnoreCase("foo");
		return isValidUserName && isValidPassword;
	}
}
