package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Bookticket;
import org.bookmyshow.repository.BookticketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookticketServiceImpl implements BookticketService {
	@Autowired
	public BookticketRepository bookticketRepository;

	public Bookticket addBookticket(Bookticket bookticket) {

		return bookticketRepository.saveAndFlush(bookticket);
	}

	public Bookticket getBookticket(Bookticket bookticket) {

		return bookticketRepository.saveAndFlush(bookticket);

	}

	@Override
	public Bookticket updateBookticket(int id, Bookticket updatedBookticket) {

		updatedBookticket.setId(id);
		return bookticketRepository.saveAndFlush(updatedBookticket);

	}

	public Bookticket deleteBookticket(Bookticket bookticket) {

		bookticketRepository.delete(bookticket);
		return bookticket;

	}

	@Override
	public Bookticket getBookticket(int id) {

		return null;
	}

	@Override
	public String getName(String name) {

		return null;
	}

	@Override
	public Bookticket getBookticketById(int id) {

		return null;
	}

	@Override
	public int getId(int id) {

		return 0;
	}

	public List<Bookticket> getBookticketList() {

		return bookticketRepository.findAll();

	}

	@Override
	public int deleteBookticket(int id) {

		return 0;
	}

}
