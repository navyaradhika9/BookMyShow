package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.Bookticket;

public interface BookticketService {
	public Bookticket addBookticket(Bookticket bookticket);

	public Bookticket getBookticket(int id);

	public Bookticket updateBookticket(int id, Bookticket updatedBookticket);

	public int deleteBookticket(int id);

	public Bookticket deleteBookticket(Bookticket id);

	public String getName(String name);

	public Bookticket getBookticketById(int id);

	int getId(int id);

	public Bookticket getBookticket(Bookticket id);

	public List<Bookticket> getBookticketList();

}
