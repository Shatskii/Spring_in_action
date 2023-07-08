package com.shatskii.spring_in_action.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("ingredient_ref")
public class IngredientRef {
    @Column("ingredient_id")
    private String id;
   public IngredientRef(String id){
        this.id = id;
    }

}
