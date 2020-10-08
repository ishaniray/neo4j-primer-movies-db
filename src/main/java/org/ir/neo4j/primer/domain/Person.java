package org.ir.neo4j.primer.domain;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnore;

@NodeEntity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private int born;

	@JsonIgnore
	@Relationship(type = "ACTED_IN")
	private List<Movie> movies = new ArrayList<>();

	public Person() {
	}

	public Person(String name, int born) {
		this.name = name;
		this.born = born;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBorn() {
		return born;
	}

	public List<Movie> getMovies() {
		return movies;
	}
}
