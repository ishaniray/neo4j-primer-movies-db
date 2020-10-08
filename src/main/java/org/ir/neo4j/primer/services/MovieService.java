package org.ir.neo4j.primer.services;

import java.util.List;

import org.ir.neo4j.primer.domain.Movie;
import org.ir.neo4j.primer.repositories.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private final MovieRepository movieRepo;

	public MovieService(MovieRepository movieRepo) {
		this.movieRepo = movieRepo;
	}

	public List<Movie> fetchMegRyanMovies() {
		return movieRepo.fetchMegRyanMovies();
	}
}
