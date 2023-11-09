package org.bookmyshow.aspect;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Payment;
import org.bookmyshow.util.PaymentTest;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
	@Before("execution(* org.bookmyshow.service.PaymentService.addPayment(org.bookmyshow.model.Payment)) && args(payment)")
	public void beforeAddPayment(Payment payment) {
		try {
			System.out.println("Payment Method :" + payment.getPaymentMethod());
			String fileName = "payment.txt";

			PaymentTest.serializeObject(payment, fileName);
			System.out.println("Object serialized and saved to " + fileName);

			Payment deserializedPayment = (Payment) PaymentTest.deserializeObject(fileName);
			System.out.println("Object deserialized: " + deserializedPayment);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
