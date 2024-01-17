package pt.iade.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

//

import pt.iade.models.*;
import pt.iade.models.repositories.BudgetRepository;
import pt.iade.models.repositories.CategoryRepository;
import pt.iade.models.responses.Response;

@RestController
@RequestMapping(path = "/api/budgets")

public class BudgetController {
    // private Logger logger = LoggerFactory.getLogger(BudgetController.class);

    @Autowired
    private BudgetRepository budgetRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Budget> ListBudgetController() {
        Iterable<Budget> budget = budgetRepository.findAll();
        return budget;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Budget getBudgetController(@PathVariable int id) {
        Budget budget = budgetRepository.findById(id).get();
        return budget;
    }

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Response deleteBudgetResponse(@PathVariable int id) {
        Budget budget = budgetRepository.findById(id).get();
        budgetRepository.delete(budget);
        return new Response(budget.getId() + " was deleted.", null);
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    private Budget postBudgetController(@RequestBody Budget budget) {
        budget.setCategory(categoryRepository.save(budget.getCategory()));
        return budgetRepository.save(budget);
    }

}