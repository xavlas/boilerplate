package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // api /user?id = 1
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/user")
    public User getUserInfo(@RequestParam(name="id", required = false, defaultValue = "1") String userID) {
        return new User("Nghia", "Nguyen");
    }
}
