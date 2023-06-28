package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository {
    List<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
