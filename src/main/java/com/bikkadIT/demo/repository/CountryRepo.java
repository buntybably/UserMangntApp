package com.bikkadIT.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.demo.entity.Country;
@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

}
