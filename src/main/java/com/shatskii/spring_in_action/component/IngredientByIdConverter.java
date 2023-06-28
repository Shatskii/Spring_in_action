package com.shatskii.spring_in_action.component;

import com.shatskii.spring_in_action.pojo.Ingredient;
import com.shatskii.spring_in_action.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;



@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {


    private final IngredientRepository repository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository repository) {
        this.repository = repository;
    }



    @Override
    public Ingredient convert(String id) {
        return repository.findById(id).orElse(null);
    }
}
