package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.MovieController;
import com.example.demo.customexceptions.IdNotFoundException;
import com.example.demo.entities.Movies;
import com.example.demo.repository.MoviesRepository;

@Service("ms")
public class MoviesServiceImpl implements IMoviesService{
	
	@Autowired
	MoviesRepository mr;
	Logger logger=LoggerFactory.getLogger(MovieController.class);

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public Movies insertMovies(Movies m) {
		// TODO Auto-generated method stub
		return mr.save(m);
	}

	@Override
	public Movies getAllByGenre(int id) {
		// TODO Auto-generated method stub
		Optional<Movies> list=mr.findById(id);
		if(list.isPresent()) {
			return list.get();
		}
		else {
			logger.error("Exception thrown");
			
			throw new IdNotFoundException("id not found");
			
					}
	}

	@Override
	public String deleteMovies(int id) {
		// TODO Auto-generated method stub
		mr.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Movies updateMovies(Movies m) {
		// TODO Auto-generated method stub
		return mr.save(m);
	}

}
