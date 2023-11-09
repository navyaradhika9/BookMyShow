package org.bookmyshow.aspect;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Bookticket;
import org.bookmyshow.util.BookticketTest;
import org.bookmyshow.util.GreetingMsg;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookticketAspect {
	@Before("execution(* org.bookmyshow.service.BookticketService.addBookticket(org.bookmyshow.model.Bookticket)) && args(bookticket)")
	public void beforeAddBookticket(Bookticket bookticket) {
		try {
			System.out.println("\nTicket Details:");
			System.out.println("Movie Title : " + bookticket.getMovieTitle());
			System.out.println("ShowTime : " + bookticket.getShowTime());
			System.out.println("LocalDate : " + bookticket.getLocaldate());
			System.out.println("Number of Seats : " + bookticket.getNumOfSeats());
			System.out.println("Theater Name : " + bookticket.getTheaterName());
			System.out.println("Thank you for using Movie Ticket Booking!");
			GreetingMsg greeting = new GreetingMsg("Enjoy the movie!");
			System.out.println(greeting.getMessage());

			String fileName = "Booktickets.txt";

			BookticketTest.serializeObject(bookticket, fileName);
			System.out.println("Object serialized and saved to " + fileName);

			Bookticket deserializedBookticket = (Bookticket) BookticketTest.deserializeObject(fileName);
			System.out.println("Object deserialized: " + deserializedBookticket);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
