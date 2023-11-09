package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.User;
import org.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserRepository userRepository;

	public User addUser(User user) {

		return userRepository.saveAndFlush(user);

	}

	@Override
	public User getUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User updateUser(int id, User updatedUser) {

		updatedUser.setId(id);
		return userRepository.saveAndFlush(updatedUser);

	}

	public User deleteUser(User user) {

		userRepository.delete(user);
		return user;

	}

	@Override
	public String getName(String name) {

		return name;

	}

	public User getUserById(int id) {

		return null;
	}

	public List<User> getUserList() {

		return userRepository.findAll();

	}

}
