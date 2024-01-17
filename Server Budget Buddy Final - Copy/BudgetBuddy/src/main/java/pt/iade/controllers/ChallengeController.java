package pt.iade.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;
import pt.iade.models.repositories.ChallengeRepository;

@RestController
@RequestMapping(path = "/api/challenge")
public class ChallengeController {

    @Autowired
    private ChallengeRepository challengeRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Challenge> ListChallengeController() {
        Iterable<Challenge> challenge = challengeRepository.findAll();
        return challenge;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Challenge getChallengeController(@PathVariable int id) {
        Challenge challenge = challengeRepository.findById(id).get();
        return challenge;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    private Challenge postChallengeController(@RequestBody Challenge challenge) {
        Challenge h;
        if (challenge.getId() == 0) {
            h = new Challenge();
            h.setName(challenge.getName());
            h.setTime(challenge.getTime());

        } else {
            h = challenge;
        }
        Challenge returnedChallenge = challengeRepository.save(h);
        return returnedChallenge;
    }

}
