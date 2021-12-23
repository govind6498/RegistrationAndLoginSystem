package com.govind.registrationloginspringbootsecuritythymeleaf.service;

import com.govind.registrationloginspringbootsecuritythymeleaf.model.User;
import com.govind.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
