package org.ir.neo4j.primer.controller;

import java.util.List;

import org.ir.neo4j.primer.domain.Movie;
import org.ir.neo4j.primer.services.MovieService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

	private final MovieService movieService;

	public MoviesController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping(value = "/meg-ryan-movies", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> getAllMegRyanMovies() {
		return movieService.fetchMegRyanMovies();
	}
}
