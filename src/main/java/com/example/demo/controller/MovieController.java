package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Movies;
import com.example.demo.services.IMoviesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("Controller which is source of endpoints for Moviee resource")
public class MovieController {
	Logger logger=LoggerFactory.getLogger(MovieController.class);

	@Autowired
	IMoviesService ms;
	@ApiOperation("Used to fetch all Movie records")
	@GetMapping("/get")
	public List<Movies> getAllMovies(){
		
		
		logger.info("Message for INFO Logging level");
		return ms.getAllMovies();
	}
	
	@PostMapping("/create")
	public Movies insertMovies(@RequestBody Movies m) {
		logger.info("Message for INFO Logging level");
		
		
		return ms.insertMovies(m);
		
	}
	@ApiOperation("Used to fetch the Movie records in the provided range of genre ")
	@GetMapping("/get/{mgenre}")
	public Movies getAllByGenre(@ApiParam("Starting Letter of genre")@PathVariable("mgenre") int id) {
		logger.info("Message for INFO Logging level");
		
		return ms.getAllByGenre(id);
		
	}
	
	@DeleteMapping("/delete/{mid}")
	public String deleteMovies(@PathVariable("mid")int id) {
		logger.info("Message for INFO Logging level");
		
		
		return ms.deleteMovies(id);
		
	}
	
	@PutMapping("/get")
	public Movies updateMovies(@RequestBody Movies m) {
		logger.info("Message for INFO Logging level");
		
		return ms.updateMovies(m);
		
	}
}