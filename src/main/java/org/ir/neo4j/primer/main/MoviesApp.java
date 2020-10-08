package org.ir.neo4j.primer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication(scanBasePackages = "org.ir.neo4j.primer")
@EntityScan(basePackages = "org.ir.neo4j.primer.domain")
@EnableNeo4jRepositories(basePackages = "org.ir.neo4j.primer.repositories")
public class MoviesApp {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApp.class, args);
	}
}
