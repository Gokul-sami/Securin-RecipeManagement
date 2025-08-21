package com.recipes.recipes.Modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "recipes", schema="recipes_schema")
public class RecipesModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JsonProperty("cuisine")
    private String cusine;
    
    @Column(name="title")
    private String title;
    
    @JsonProperty("Contient")
    private String continent;
    
    @JsonProperty("Country_State")
    private String country_state;
    
    @JsonProperty("URL")
    private String url;
    
    @Column(name="rating")
    private Float rating;
    
    @JsonProperty("total_time")
    private int total_time;
    
    @JsonProperty("prep_time")
    private int prep_time;
    
    @JsonProperty("cook_time")
    private int cook_time;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("serves")
    private String serves;

    // private NutrientsModal nutrientsModal;

    public RecipesModal(String cusine, String continent, String title, String country_state, Float rating, int total_time, String url, int prep_time, int cook_time, String description, String serves) {
        this.cusine = cusine;
        this.continent = continent;
        this.title = title;
        this.country_state = country_state;
        this.rating = rating;
        this.total_time = total_time;
        this.url = url;
        this.prep_time = prep_time;
        this.cook_time = cook_time;
        this.description = description;
        this.serves = serves;
    }

    public RecipesModal() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCusine() {
        return cusine;
    }

    public void setCusine(String cusine) {
        this.cusine = cusine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry_state() {
        return country_state;
    }

    public void setCountry_state(String country_state) {
        this.country_state = country_state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getTotal_time() {
        return total_time;
    }

    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }

    public int getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(int prep_time) {
        this.prep_time = prep_time;
    }

    public int getCook_time() {
        return cook_time;
    }

    public void setCook_time(int cook_time) {
        this.cook_time = cook_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServes() {
        return serves;
    }

    public void setServes(String serves) {
        this.serves = serves;
    }
}
