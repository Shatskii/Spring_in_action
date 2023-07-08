package com.shatskii.spring_in_action.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.*;

@Data
@Table("taco")
public class Taco {
    @Id
    @Column("id")
    private int id;

    @Column("name")
    private String name;

//    @Column("taco_order")
//    private int tacoOrder;

//    @Column("taco_order_key")
//    private int tacoOrderKey;

    @Column("created_at")
    private Date date = new Date();
    @MappedCollection(idColumn = "taco_id")
    private Set<IngredientRef> ingredients = new HashSet<>();


    public void addIngredient() {

    }
}
