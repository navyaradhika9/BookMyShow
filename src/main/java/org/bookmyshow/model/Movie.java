package org.bookmyshow.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

@Table(name = "movie")
@Entity
public class Movie implements Serializable {
	@Id
	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "movie_title", nullable = false)
	@NotBlank(message = "MovieTitle cannot be blank")
	private String movieTitle;

	@Column(name = "movie_duration", nullable = false)
	@Min(value = 1, message = "Movie Duration must be greater than 0")
	private int movieDuration;

	@Column(name = "movie_ticket_price", nullable = false)
	@Min(value = 1, message = "Movie Ticket Price  must be greater than 0")
	private double movieTicketPrice;

	@CreationTimestamp
	@Column(name = "last_modified")
	private Timestamp lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	public void setMovieduration(int movieDuration) {
		this.movieDuration = movieDuration;
	}

	public int getMovieduration() {
		return this.movieDuration;
	}

	public void setMovieticketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}

	public double getMovieticketPrice() {
		return this.movieTicketPrice;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Movie() {
	}
}
