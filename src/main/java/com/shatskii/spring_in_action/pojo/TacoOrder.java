package com.shatskii.spring_in_action.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.*;

@Data
@Table("taco_order")
public class TacoOrder {
    @Column("id")
    @Id
    private int id;

    @Column("delivery_name")
    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @Column("delivery_street")
    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @Column("delivery_city")
    @NotBlank(message = "City name is required")
    private String deliveryCity;

    @Column("delivery_state")
    @NotBlank(message = "State name is required")
    private String deliveryState;

    @Column("delivery_zip")
    @NotBlank(message = "Zip name is required")
    private String deliveryZip;

    @Column("cc_number")
    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}",
            message = "Must be formatted xxxx-xxxx-xxxx-xxxx")
    private String ccNumber;

    @Column("cc_expiration")
    @Pattern(regexp = "\\d{2}/\\d{2}",
            message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Column("cc_cvv")
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    @Column("placed_at")
    private Date placedAt = new Date();
    @MappedCollection(idColumn = "taco_order")
    private Set<Taco> tacos = new HashSet<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }


}
