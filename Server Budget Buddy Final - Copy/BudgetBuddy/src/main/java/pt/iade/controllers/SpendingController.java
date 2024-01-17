package pt.iade.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.*;
import pt.iade.models.repositories.SpendingRepository;
import pt.iade.models.responses.Response;

@RestController
@RequestMapping(path = "/api/spending")

public class SpendingController {
    @Autowired
    private SpendingRepository spendingRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Spending> ListSpendingController() {
        Iterable<Spending> spending = spendingRepository.findAll();
        return spending;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Spending getSpendingController(@PathVariable int id) {
        Spending spending = spendingRepository.findById(id).get();
        return spending;
    }

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Response deleteSpendingtResponse(@PathVariable int id) {
        Spending spending = spendingRepository.findById(id).get();
        spendingRepository.delete(spending);
        return new Response(spending.getId() + " was deleted.", null);
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    private Spending postSpendingController(@RequestBody Spending spending) {
        Spending s;
        if (spending.getId() == 0) {
            s = new Spending();
            s.setName(spending.getName());
            s.setDate(spending.getDate());
            s.setSpendValue(spending.getSpendValue());
            s.setUser(spending.getUser());

        } else {
            s = spending;
        }
        Spending returnedSpending = spendingRepository.save(s);
        return returnedSpending;
    }
}