package com.shatskii.spring_in_action.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("ingredient")
public class Ingredient {
    @Id
    @Column("id")
    private String id;

    @Column("name")
    private String name;

    @Column("type")
    private Type type;


    public enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE
    }


}
