package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
