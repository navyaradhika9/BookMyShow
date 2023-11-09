package org.bookmyshow.controller;

import java.util.List;

import javax.validation.Valid;

import org.bookmyshow.model.Bookticket;
import org.bookmyshow.service.BookticketService;
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
@RequestMapping("movieticketbooking/booktickets")
public class BookticketController {

	@Autowired
	public BookticketService bookticketService;

	@PostMapping("/add")
	public Bookticket addTicket(@RequestBody @Valid Bookticket bookticket) {

		return bookticketService.addBookticket(bookticket);
	}

	@GetMapping("/id")
	public Bookticket getBookticket(@RequestParam Bookticket id) {
		return bookticketService.getBookticket(id);
	}

	@GetMapping("/booktickets")
	public List<Bookticket> booktickets() {
		return bookticketService.getBookticketList();
	}

	@PutMapping("/update/{id}")
	public Bookticket updateBookticket(@PathVariable int id, @RequestBody Bookticket updatedBookticket) {
		return bookticketService.updateBookticket(id, updatedBookticket);
	}

	@DeleteMapping("/delete/{id}")
	public Bookticket deleteBookticket(@PathVariable Bookticket id) {
		return bookticketService.deleteBookticket(id);
	}

}
