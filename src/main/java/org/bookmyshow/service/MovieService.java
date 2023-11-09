package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Movie;

public interface MovieService {

	public Movie addMovie(Movie movie);

	public Movie updateMovie(int id, Movie updatedMovie);

	public Movie deleteMovie(Movie id);

	public String getName(String name);

	public Movie getMovieById(int id);

	public Movie getMovie(Movie movie);

	public List<Movie> getMovieList();

}
