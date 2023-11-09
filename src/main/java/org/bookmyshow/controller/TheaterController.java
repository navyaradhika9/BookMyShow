package org.bookmyshow.controller;

import java.util.List;

import javax.validation.Valid;

import org.bookmyshow.model.Theater;
import org.bookmyshow.service.TheaterService;
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
@RequestMapping("movieticketbooking/theater")
public class TheaterController {
	@Autowired
	public TheaterService theaterService;

	@PostMapping("/add")
	public Theater addTheater(@RequestBody @Valid Theater theater) {

		return theaterService.addTheater(theater);
	}

	@GetMapping("/id")
	public Theater getTheater(@RequestParam Theater id) {
		return theaterService.getTheater(id);
	}

	@GetMapping("/theaters")
	public List<Theater> theaters() {
		return theaterService.getTheaterList();
	}

	@PutMapping("/update/{id}")
	public Theater updateTheater(@PathVariable int id, @RequestBody Theater updatedTheater) {
		return theaterService.updateTheater(id, updatedTheater);
	}

	@DeleteMapping("/delete/{id}")
	public Theater deleteTheater(@PathVariable Theater id) {
		return theaterService.deleteTheater(id);
	}

}
