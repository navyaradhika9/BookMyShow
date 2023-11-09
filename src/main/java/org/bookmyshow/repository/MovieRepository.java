package org.bookmyshow.repository;

import org.bookmyshow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	public Movie findById(int id);

}
