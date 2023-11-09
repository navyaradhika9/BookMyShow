package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Movie;
import org.bookmyshow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	public MovieRepository movieRepository;

	public Movie addMovie(Movie movie) {
		return movieRepository.saveAndFlush(movie);
	}

	public Movie getMovie(Movie movie) {

		return movieRepository.saveAndFlush(movie);

	}

	@Override
	public Movie updateMovie(int id, Movie updatedMovie) {

		updatedMovie.setId(id);
		return movieRepository.saveAndFlush(updatedMovie);

	}

	public Movie deleteMovie(Movie movie) {

		movieRepository.delete(movie);
		return movie;

	}

	@Override
	public String getName(String name) {

		return name;
	}

	@Override
	public Movie getMovieById(int id) {

		return null;
	}

	public List<Movie> getMovieList() {

		return movieRepository.findAll();

	}

}
