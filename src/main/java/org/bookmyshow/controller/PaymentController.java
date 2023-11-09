package org.bookmyshow.controller;

import java.util.List;

import javax.validation.Valid;

import org.bookmyshow.model.Payment;
import org.bookmyshow.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movieticketbooking/paymentservice")
public class PaymentController {
	@Autowired
	public PaymentService paymentService;

	@PostMapping("/add")
	public Payment addPayment(@RequestBody @Valid Payment payment) {
		return paymentService.addPayment(payment);
	}

	@GetMapping("/id")
	public Payment getPayment(@RequestParam Payment id) {
		return paymentService.getPayment(id);
	}

	@GetMapping("/payments")
	public List<Payment> payments() {
		return paymentService.getPaymentList();
	}

	@PutMapping("/update/{id}")
	public Payment updatePayment(@PathVariable int id, @RequestBody Payment updatedPayment) {
		return paymentService.updatePayment(id, updatedPayment);
	}

	@DeleteMapping("/delete/{id}")
	public Payment deletePayment(@PathVariable Payment id) {
		return paymentService.deletePayment(id);

	}

}
