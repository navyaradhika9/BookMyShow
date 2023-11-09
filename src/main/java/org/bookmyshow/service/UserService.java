package org.bookmyshow.service;

import java.util.List;

import org.bookmyshow.model.User;

public interface UserService {
	public User addUser(User user);

	public User getUser(User user);

	public User updateUser(int id, User updatedUser);

	public String getName(String name);

	public User getUserById(int id);

	public List<User> getUserList();

	public User deleteUser(User id);

}
