package com.shatskii.spring_in_action.pojo;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("ingredient_ref")
public class IngredientRef {

    @Column("ingredient")
    private String ingredient;

    @Column("taco")
    private int taco;

    @Column("taco_key")
    private int tacoKey;
}
