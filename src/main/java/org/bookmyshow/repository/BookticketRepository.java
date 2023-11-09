package org.bookmyshow.repository;

import org.bookmyshow.model.Bookticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookticketRepository extends JpaRepository<Bookticket, Integer> {
	public Bookticket findById(int id);

}
