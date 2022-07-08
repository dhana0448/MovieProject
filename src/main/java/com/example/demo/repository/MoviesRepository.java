package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movies;

@Repository("mr")
public interface MoviesRepository extends JpaRepository<Movies, Integer>{
	

}
