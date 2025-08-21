package com.recipes.recipes.RecipesController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.recipes.Modal.RecipesModal;
import com.recipes.recipes.Repository.RecipesRepo;
import com.recipes.recipes.Services.RecipesService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Recipes {

    @Autowired
    private RecipesService recipesService;

    @Autowired
    private RecipesRepo recipesRepo;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("recipes", recipesRepo.findAll());
        return "index";
    }

    @GetMapping("/api/recipes")
    @ResponseBody
    public List<RecipesModal> getAllRecipes() {
        return recipesRepo.findAll();
    }
    
    // @GetMapping("/api/recipe/search/{id}")
    // @ResponseBody
    // public ResponseEntity<RecipesModal> getRecipe(@RequestParam int id) {
    //     return recipesRepo.findById(id)
    //             .map(ResponseEntity::ok)
    //             .orElse(ResponseEntity.notFound().build());
    // }

    //manual data fed in db
    // @GetMapping("/api/recipes/search/{calories}/{title}/{rating}")
    // public Optional<RecipesModal> getRecipe(@RequestParam int calories, @RequestParam String title, @RequestParam float rating) {
    //     return recipesRepo.findByCaloriesAndTitleAndRating(calories, title, rating);
    // }

    @GetMapping("/api/recipes/search")
    @ResponseBody
    public List<RecipesModal> searchRecipes(@RequestParam(required = false) String title, @RequestParam(required = false) Float rating) {
        if (title != null && rating != null) {
            return recipesRepo.findByTitleAndRating(title, rating).stream().toList();
        } else if (title != null) {
            return recipesRepo.findByTitleContaining(title);
        } else if (rating != null) {
            return recipesRepo.findByRating(rating);
        }
        return recipesRepo.findAll();
    }
    
}
