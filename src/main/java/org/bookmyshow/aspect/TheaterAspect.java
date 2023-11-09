package org.bookmyshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Theater;
import org.bookmyshow.util.TheaterTest;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TheaterAspect {
	@Before("execution(* org.bookmyshow.service.TheaterService.addTheater(org.bookmyshow.model.Theater)) && args(theater)")
	public void beforeAddTheater(Theater theater) {
		try {
			System.out.println("\nAvailable Theater:");
			System.out.println("Theater Name:" + theater.getName());
			System.out.println("Available Seats:" + theater.getAvailableseats());
			System.out.println("ShowTime:" + theater.getShowTime());
			System.out.println("Localdate:" + theater.getLocaldate());
			System.out.println("Contact Number:" + theater.getContactNumber());
			System.out.println("Address:" + theater.getAddress());
			String fileName = "Theater.txt";

			TheaterTest.serializeObject(theater, fileName);
			System.out.println("Object serialized and saved to " + fileName);

			Theater deserializedTheater = (Theater) TheaterTest.deserializeObject(fileName);
			System.out.println("Object deserialized: " + deserializedTheater);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
