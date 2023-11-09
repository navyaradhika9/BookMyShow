package org.bookmyshow.controller;

import java.util.List;

import javax.validation.Valid;

import org.bookmyshow.model.User;
import org.bookmyshow.service.UserService;
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
@RequestMapping("movieticketbooking/user")
public class UserController {
	@Autowired
	public UserService userService;

	@PostMapping("/add")
	public User addNewUser(@RequestBody @Valid User user) {

		return userService.addUser(user);
	}

	@GetMapping("/id")
	public User getUser(@RequestParam User id) {
		return userService.getUser(id);
	}

	@GetMapping("/users")
	public List<User> users() {
		return userService.getUserList();
	}

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);
	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable User id) {
		return userService.deleteUser(id);
	}

}
