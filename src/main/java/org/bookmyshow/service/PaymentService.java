package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Payment;
import org.bookmyshow.model.User;

public interface PaymentService {

	public Payment addPayment(Payment payment);

	public Payment getPayment(int id);

	public Payment updatePayment(int id, Payment updatedPayment);

	public Payment getPaymentById(int id);

	public Payment updatePayment(int id, User updatedPayment);

	public Payment deletePayment(Payment id);

	public int getId(int id);

	public Payment getPayment(Payment id);

	public List<Payment> getPaymentList();

}
