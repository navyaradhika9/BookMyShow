package org.bookmyshow.repository;

import org.bookmyshow.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {

	public Theater findById(int id);

}
