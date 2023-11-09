package org.bookmyshow.repository;

import org.bookmyshow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	public Payment findById(int id);

}
