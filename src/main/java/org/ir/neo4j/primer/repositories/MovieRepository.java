package org.ir.neo4j.primer.repositories;

import java.util.List;

import org.ir.neo4j.primer.domain.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {

	@Query("MATCH(:Person {name: 'Meg Ryan'})-[:ACTED_IN]->(movie:Movie) RETURN movie")
	List<Movie> fetchMegRyanMovies();
}
