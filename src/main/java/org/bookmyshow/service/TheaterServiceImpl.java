package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Theater;
import org.bookmyshow.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterServiceImpl implements TheaterService {
	@Autowired
	public TheaterRepository theaterRepository;

	public Theater addTheater(Theater theater) {
		return theaterRepository.saveAndFlush(theater);
	}

	@Override
	public Theater getTheater(Theater theater) {
		return theaterRepository.saveAndFlush(theater);
	}

	@Override
	public Theater updateTheater(int id, Theater updatedTheater) {

		updatedTheater.setId(id);
		return theaterRepository.saveAndFlush(updatedTheater);

	}

	public Theater deleteTheater(Theater theater) {

		theaterRepository.delete(theater);
		return theater;

	}

	@Override
	public String getName(String name) {

		return name;
	}

	@Override
	public Theater getTheaterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId(int id) {

		return 0;
	}

	@Override
	public int addTheater(int id) {

		return 0;
	}

	public Theater getTheater(Integer id) {

		return null;
	}

	@Override
	public Theater getTheater(int id) {

		return null;
	}

	public List<Theater> getTheaterList() {

		return theaterRepository.findAll();

	}

}
