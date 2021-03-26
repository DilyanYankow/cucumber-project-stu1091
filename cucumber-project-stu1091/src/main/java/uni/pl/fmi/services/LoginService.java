package uni.pl.fmi.services;



import java.util.ArrayList;
import java.util.List;

import uml.User;

public class LoginService {

	public static String login(String username, String password) {
		final List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user ->
													username.equals(user.getUsername())
													&& password.equals(user.getPassword()));
		return isUserMatch ? "OK" : "User not found";
	}

	
	public static List<User> getUsers() {
		final User user = new User();
		user.setUsername("Dilyan");
		user.setPassword("Yankov");
		final List<User> result = new ArrayList<>();
		result.add(user);
		
		return result;
	}
}
