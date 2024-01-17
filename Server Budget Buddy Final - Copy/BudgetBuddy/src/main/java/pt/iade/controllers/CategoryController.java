package pt.iade.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import pt.iade.models.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.models.Category;

@RestController
@RequestMapping(path = "/api/category")

public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    // private Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private Iterable<Category> ListCategoryController() {
        Iterable<Category> category = categoryRepository.findAll();
        return category;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Category getCategoryController(@PathVariable int id) {
        Category category = categoryRepository.findById(id).get();
        return category;
    }
}