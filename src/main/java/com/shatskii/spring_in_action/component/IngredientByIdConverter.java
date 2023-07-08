package com.shatskii.spring_in_action.component;

import com.shatskii.spring_in_action.pojo.IngredientRef;
import com.shatskii.spring_in_action.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class IngredientByIdConverter implements Converter<String, IngredientRef> {
    private IngredientRepository repository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public IngredientRef convert(String id) {
        return new IngredientRef(repository.findById(id).get().getId());
    }
}
