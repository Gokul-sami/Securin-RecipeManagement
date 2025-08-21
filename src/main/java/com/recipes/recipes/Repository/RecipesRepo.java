package com.recipes.recipes.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.recipes.Modal.RecipesModal;

public interface RecipesRepo extends JpaRepository<RecipesModal, Integer>{

    Optional<RecipesModal> findByTitleAndRating(String title, Float rating);

    List<RecipesModal> findByTitleContaining(String title);

    List<RecipesModal> findByRating(Float rating);

}
