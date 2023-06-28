package com.shatskii.spring_in_action.pojo;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @NotBlank(message = "City name is required")
    private String deliveryCity;

    @NotBlank(message = "State name is required")
    private String deliveryState;

    @NotBlank(message = "Zip name is required")
    private String deliveryZip;

    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}",
            message = "Must be formatted xxxx-xxxx-xxxx-xxxx")
    private String ccNumber;

    @Pattern(regexp = "\\d{2}/\\d{2}",
            message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }


}
