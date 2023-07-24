package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
