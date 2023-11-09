package org.bookmyshow.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Table(name = "booktickets")
@Entity
public class Bookticket implements Serializable {
	@Id
	@Column(name = "ticket_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "movie_title", nullable = false)
	@NotBlank(message = "movieTitle cannot be blank")
	private String movieTitle;

	@Column(name = "show_time", nullable = false)
	@NotBlank(message = "showTime cannot be blank")
	private String showTime;

	@Column(name = "Local_Date", nullable = false)
	@NotNull(message = "LocalDate cannot be blank")
	private LocalDate localdate;

	@Column(name = "no_of_seats", nullable = false)
	@Min(value = 0, message = "NumOfSeats must be a positive number")
	private int seats;

	@Column(name = "theater_name", nullable = false)
	@NotBlank(message = "Theater name cannot be blank")
	private String theaterName;

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

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public int getNumOfSeats() {
		return seats;
	}

	public void setNumOfSeats(int seats) {
		this.seats = seats;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterName() {
		return this.theaterName;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Bookticket() {
	}

}
