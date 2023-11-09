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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Table(name = "theater")
@Entity
public class Theater implements Serializable {

	@Id
	@Column(name = "theater_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "theater_name", nullable = false)
	@NotBlank(message = "TheaterName cannot be blank")
	private String name;

	@Column(name = "available_seats", nullable = false)
	@NotNull(message = "Available Seats cannot be blank")
	private int seats;

	@Column(name = "show_time", nullable = false)
	@NotBlank(message = "ShowTime cannot be blank")
	private String showTime;

	@Column(name = "Local_Date")
	// @NotBlank(message = "LocalDate cannot be blank")
	private LocalDate localdate;

	@Column(name = "contact_number", nullable = false)
	@NotBlank(message = "Contact Number cannot be blank")
	private String contactNumber;

	@Column(name = "address", nullable = false)
	@NotBlank(message = "Address cannot be blank")
	private String address;

	@CreationTimestamp
	@Column(name = "last_modified")
	private Timestamp lastModified;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAvailableseats() {
		return seats;
	}

	public void setAvailableseats(int seats) {
		this.seats = seats;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Theater() {
	}

	

}
