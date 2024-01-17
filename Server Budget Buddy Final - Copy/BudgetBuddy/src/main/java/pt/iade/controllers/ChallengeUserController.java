package pt.iade.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;

import pt.iade.models.repositories.ChallengeUserRepository;

@RestController
@RequestMapping(path = "/api/challengeuser")
public class ChallengeUserController {

    @Autowired
    private ChallengeUserRepository challengeUserRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<ChallengeUser> ListChallengeUserController() {
        Iterable<ChallengeUser> challengeUser = challengeUserRepository.findAll();
        return challengeUser;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ChallengeUser getChallengeUserController(@PathVariable int id) {
        ChallengeUser challengeUser = challengeUserRepository.findById(id).get();
        return challengeUser;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    private ChallengeUser postChallengeUserController(@RequestBody ChallengeUser challengeUser) {
        ChallengeUser hu;
        if (challengeUser.getId() == 0) {
            hu = new ChallengeUser();
            hu.setChallId(challengeUser.getChallId());
            hu.setUserId(challengeUser.getUserId());

        } else {
            hu = challengeUser;
        }
        ChallengeUser returnedChallengeUser = challengeUserRepository.save(hu);
        return returnedChallengeUser;
    }

}
