package com.recipes.recipes.Modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class IngredientsModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int recipe_id;
    @JsonProperty("ingredients")
    private String ingredients;

    
    public IngredientsModal(int recipe_id, String ingredients) {
        this.recipe_id = recipe_id;
        this.ingredients = ingredients;
    }

    public int getRecipe_id() {
        return recipe_id;
    }
    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    
}
