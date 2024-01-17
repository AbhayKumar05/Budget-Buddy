package pt.iade.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;
import pt.iade.models.repositories.UsercommRepository;

@RestController
@RequestMapping(path = "/api/usercomm")
public class UsercommController {
    @Autowired
    private UsercommRepository usercommRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Usercomm> ListUsercommController() {
        Iterable<Usercomm> usercomm = usercommRepository.findAll();
        return usercomm;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Usercomm getUsercommController(@PathVariable int id) {
        Usercomm usercomm = usercommRepository.findById(id);
        return usercomm;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)

    private Usercomm postUsercommController(@RequestBody Usercomm usercomm) {
        Usercomm uc;
        if (usercomm.getId() == 0) {
            uc = new Usercomm();
            uc.setUserId(usercomm.getUserId());
            uc.setCommId(usercomm.getCommId());

        } else {
            uc = usercomm;
        }
        Usercomm returnedUsercomm = usercommRepository.save(uc);
        return returnedUsercomm;
    }

}
