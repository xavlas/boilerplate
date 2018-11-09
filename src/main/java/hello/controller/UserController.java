package hello.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.User;

/**
 * 
 * @author xavier
 * api /user?id = 1
 */
@RestController
public class UserController {
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/user")
	public User getUserInfo(@RequestParam(name = "id", required = false, defaultValue = "1") String userID) {
		return new User("Doe", "John");
	}
}
