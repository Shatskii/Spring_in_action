package com.shatskii.spring_in_action.pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt = new Date();
    private String name;


    private List<Ingredient> ingredients;


}
