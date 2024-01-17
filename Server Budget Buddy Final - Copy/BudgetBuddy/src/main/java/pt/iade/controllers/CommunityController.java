package pt.iade.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;
import pt.iade.models.repositories.CommunityRepository;

@RestController
@RequestMapping(path = "/api/community")
public class CommunityController {

    @Autowired
    private CommunityRepository communityRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Community> ListCommunityController() {
        Iterable<Community> community = communityRepository.findAll();
        return community;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Community getCommunityController(@PathVariable int id) {
        Community community = communityRepository.findById(id).get();
        return community;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    private Community postCommunityController(@RequestBody Community community) {
        Community c;
        if (community.getId() == 0) {
            c = new Community();
            c.setName(community.getName());
            c.setValue(community.getValue());
        } else {
            c = community;
        }
        Community returnedCommunity = communityRepository.save(c);
        return returnedCommunity;
    }

}
