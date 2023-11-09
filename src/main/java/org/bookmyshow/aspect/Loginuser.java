package org.bookmyshow.aspect;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.User;
import org.bookmyshow.util.Test;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loginuser {
	@Before("execution(* org.bookmyshow.service.UserService.addUser(org.bookmyshow.model.User)) && args(user)")
	public void beforeAddUser(User user) {
		try {
			System.out.println("Welcome to Movie Ticket Booking!");
			System.out.println("UserName:" + user.getName());

			System.out.println("Password:" + user.getPassword());
			System.out.println("Login successful, " + user.getName() + "!");
			// String filePath = "C:\\Users\\NEW\\bookmyshow\\";
			String fileName = "User.txt";

			// Create an instance of the object to be serialized
			// User user1 = new User(); // You should create an actual User object here

			// try {
			// Serialize the object
			Test.serializeObject(user, fileName);
			System.out.println("Object serialized and saved to " + fileName);

			// Deserialize the object
			User deserializedUser = (User) Test.deserializeObject(fileName);
			System.out.println("Object deserialized: " + deserializedUser);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
