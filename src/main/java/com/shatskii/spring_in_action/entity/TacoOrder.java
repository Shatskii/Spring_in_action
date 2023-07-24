package com.shatskii.spring_in_action.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "taco_order")
public class TacoOrder {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "delivery_name")
    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @Column(name = "delivery_street")
    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @Column(name = "delivery_city")
    @NotBlank(message = "City name is required")
    private String deliveryCity;

    @Column(name = "delivery_state")
    @NotBlank(message = "State name is required")
    private String deliveryState;

    @Column(name = "delivery_zip")
    @NotBlank(message = "Zip name is required")
    private String deliveryZip;

    @Column(name = "cc_number")
    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}",
            message = "Must be formatted xxxx-xxxx-xxxx-xxxx")
    private String ccNumber;

    @Column(name = "cc_expiration")
    @Pattern(regexp = "\\d{2}/\\d{2}",
            message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Column(name = "cc_cvv")
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    @Column(name = "placed_at")
    private Date placed_at = new Date();
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "taco_order")
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }


}
