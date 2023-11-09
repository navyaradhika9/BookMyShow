package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Payment;
import org.bookmyshow.model.User;
import org.bookmyshow.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	public PaymentRepository paymentRepository;

	public Payment addPayment(Payment payment) {

		return paymentRepository.saveAndFlush(payment);
	}

	@Override
	public Payment getPayment(Payment payment) {
		return paymentRepository.saveAndFlush(payment);
	}

	@Override
	public Payment updatePayment(int id, Payment updatedPayment) {

		updatedPayment.setId(id);
		return paymentRepository.saveAndFlush(updatedPayment);

	}

	@Override
	public Payment getPaymentById(int id) {

		return null;
	}

	public int getId(int id) {

		return 0;
	}

	@Override
	public Payment getPayment(int id) {

		return null;
	}

	@Override
	public Payment updatePayment(int id, User updatedPayment) {

		return null;
	}

	public Payment deletePayment(Payment payment) {

		paymentRepository.delete(payment);
		return payment;

	}

	public List<Payment> getPaymentList() {

		return paymentRepository.findAll();

	}

}
