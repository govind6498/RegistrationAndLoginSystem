package com.govind.registrationloginspringbootsecuritythymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.govind.registrationloginspringbootsecuritythymeleaf.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
