package com.example.demo.services;
import java.util.List;

import com.example.demo.entities.Movies;

public interface IMoviesService {
	List<Movies> getAllMovies();
	Movies insertMovies(Movies m);
	Movies getAllByGenre(int id);
	String deleteMovies(int id);
	Movies updateMovies(Movies m);
	
}
