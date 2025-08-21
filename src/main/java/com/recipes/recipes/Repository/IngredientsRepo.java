package com.recipes.recipes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.recipes.Modal.NutrientsModal;

public interface IngredientsRepo extends JpaRepository<NutrientsModal, Integer> {

}
