package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Theater;

public interface TheaterService {
	public Theater addTheater(Theater theater);

	public String getName(String name);

	public Theater updateTheater(int id, Theater updatedTheater);

	public int addTheater(int id);

	public Theater getTheater(int id);

	public Theater deleteTheater(Theater id);

	public Theater getTheaterById(int id);

	public Theater getTheater(Theater id);

	public List<Theater> getTheaterList();

}
