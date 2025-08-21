package com.recipes.recipes.Modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nutrients", schema="recipes_schema")
public class NutrientsModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int recipe_id;
    @JsonProperty("calories")
    private String calories;
    
    @JsonProperty("carbohydrateContent")
    private String carbohydrateContent;
    @JsonProperty("cholesterolContent")
    private String cholesterolContent;
    @JsonProperty("fiberContent")
    private String fiberContent;
    
    @JsonProperty("proteinContent")
    private String proteinContent;
    @JsonProperty("saturatedFatContent")
    private String saturatedFatContent;
    @JsonProperty("sodiumContent")
    private String sodiumContent;
    @JsonProperty("sugarContent")
    private String sugarContent;
    @JsonProperty("fatContent")
    private String fatContent;
    @JsonProperty("unsaturatedFatContent")
    private String unsaturatedFatContent;

    public NutrientsModal(String calories, String carbohydrateContent, String cholesterolContent, String fiberContent,
        String proteinContent, String saturatedFatContent, String sodiumContent, String sugarContent,
        String fatContent, String unsaturatedFatContent) {
        this.calories = calories;
        this.carbohydrateContent = carbohydrateContent;
        this.cholesterolContent = cholesterolContent;
        this.fiberContent = fiberContent;
        this.proteinContent = proteinContent;
        this.saturatedFatContent = saturatedFatContent;
        this.sodiumContent = sodiumContent;
        this.sugarContent = sugarContent;
        this.fatContent = fatContent;
        this.unsaturatedFatContent = unsaturatedFatContent;
    }
    
    public String getCalories() {
        return calories;
    }
    public void setCalories(String calories) {
        this.calories = calories;
    }
    public String getCarbohydrateContent() {
        return carbohydrateContent;
    }
    public void setCarbohydrateContent(String carbohydrateContent) {
        this.carbohydrateContent = carbohydrateContent;
    }
    public String getCholesterolContent() {
        return cholesterolContent;
    }
    public void setCholesterolContent(String cholesterolContent) {
        this.cholesterolContent = cholesterolContent;
    }
    public String getFiberContent() {
        return fiberContent;
    }
    public void setFiberContent(String fiberContent) {
        this.fiberContent = fiberContent;
    }
    public String getProteinContent() {
        return proteinContent;
    }
    public void setProteinContent(String proteinContent) {
        this.proteinContent = proteinContent;
    }
    public String getSaturatedFatContent() {
        return saturatedFatContent;
    }
    public void setSaturatedFatContent(String saturatedFatContent) {
        this.saturatedFatContent = saturatedFatContent;
    }
    public String getSodiumContent() {
        return sodiumContent;
    }
    public void setSodiumContent(String sodiumContent) {
        this.sodiumContent = sodiumContent;
    }
    public String getSugarContent() {
        return sugarContent;
    }
    public void setSugarContent(String sugarContent) {
        this.sugarContent = sugarContent;
    }
    public String getFatContent() {
        return fatContent;
    }
    public void setFatContent(String fatContent) {
        this.fatContent = fatContent;
    }
    public String getUnsaturatedFatContent() {
        return unsaturatedFatContent;
    }
    public void setUnsaturatedFatContent(String unsaturatedFatContent) {
        this.unsaturatedFatContent = unsaturatedFatContent;
    }
}
