package com.shatskii.spring_in_action.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient_ref")
@Data
public class IngredientRef {
    @Id
    @Column(name = "ingredient_id")
    private String id;

    public IngredientRef() {
    }

    public IngredientRef(String id) {
        this.id = id;
    }

}
