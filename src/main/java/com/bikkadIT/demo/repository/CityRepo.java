package com.bikkadIT.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.demo.entity.City;
@Repository
public interface CityRepo extends JpaRepository<City, Integer> {

}
