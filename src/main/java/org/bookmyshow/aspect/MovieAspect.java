package org.bookmyshow.aspect;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Movie;
import org.bookmyshow.util.MovieTest;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MovieAspect {
	@Before("execution(* org.bookmyshow.service.MovieService.addMovie(org.bookmyshow.model.Movie)) && args(movie)")
	public void beforeAddMovie(Movie movie) {
		try {
			System.out.println("\nAvailable Movie:");
			System.out.println("Movie Name : " + movie.getMovieTitle());
			System.out.println("Duration : " + movie.getMovieduration());
			System.out.println("Movie Ticket Price : " + movie.getMovieticketPrice());
			// String filePath = "C:\\Users\\NEW\\bookmyshow\\";
			String fileName = "movie_info.txt";

			MovieTest.serializeObject(movie, fileName);
			System.out.println("Object serialized and saved to " + fileName);

			Movie deserializedMovie = (Movie) MovieTest.deserializeObject(fileName);
			System.out.println("Object deserialized: " + deserializedMovie);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
