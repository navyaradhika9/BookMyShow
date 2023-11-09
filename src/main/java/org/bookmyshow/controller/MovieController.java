package org.bookmyshow.controller;

import java.util.List;

import javax.validation.Valid;

import org.bookmyshow.model.Movie;
import org.bookmyshow.service.MovieService;
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
@RequestMapping("movieticketbooking/movie")
public class MovieController {
	@Autowired
	public MovieService movieService;

	@PostMapping("/add")
	public Movie addNewMovie(@RequestBody @Valid Movie movie) {

		return movieService.addMovie(movie);
	}

	@GetMapping("/id")
	public Movie getMovie(@RequestParam Movie id) {
		return movieService.getMovie(id);
	}

	@GetMapping("/movies")
	public List<Movie> movies() {
		return movieService.getMovieList();
	}

	@PutMapping("/update/{id}")
	public Movie updateMovie(@PathVariable int id, @RequestBody Movie updatedMovie) {
		return movieService.updateMovie(id, updatedMovie);
	}

	@DeleteMapping("/delete/{id}")
	public Movie deleteMovie(@PathVariable Movie id) {
		return movieService.deleteMovie(id);
	}

}
