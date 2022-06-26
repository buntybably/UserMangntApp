package com.bikkadIT.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.demo.entity.Gender;
@Repository
public interface GenderRepo extends JpaRepository<Gender, Integer> {

}
