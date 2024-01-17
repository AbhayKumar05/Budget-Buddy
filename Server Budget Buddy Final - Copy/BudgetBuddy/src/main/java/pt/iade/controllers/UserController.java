package pt.iade.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;
import pt.iade.models.repositories.UserRepository;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<User> ListUserController() {
        Iterable<User> user = userRepository.findAll();
        return user;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private User getUserController(@PathVariable int id) {
        User user = userRepository.findById(id);
        return user;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)

    private User postUserController(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    private User postLoginController(User.Login login) {
        User user = userRepository.findByEmailAndPassword(login.getEmail(), login.getPassword());
        if (user != null && user.getPassword().equals(login.getPassword())
                && user.getEmail().equals(login.getEmail())) {

            return user;
        } else {
            return null;
        }
    }

}
