package com.recipes.recipes.Modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class InstructionModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int recipe_id;
    @JsonProperty("instructions")
    private String instructions;
    
    public void setRecipeId(int id){
        this.recipe_id = id;
    }
}
