package com.bikkadIT.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.demo.entity.State;
@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

}
