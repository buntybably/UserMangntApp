package com.bikkadIT.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
