package com.govind.registrationloginspringbootsecuritythymeleaf.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.govind.registrationloginspringbootsecuritythymeleaf.model.Role;
import com.govind.registrationloginspringbootsecuritythymeleaf.model.User;
import com.govind.registrationloginspringbootsecuritythymeleaf.repository.UserRepository;
import com.govind.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
//	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(
				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
		
	
	}

}
