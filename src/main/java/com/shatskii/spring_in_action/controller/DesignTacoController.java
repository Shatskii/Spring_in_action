package com.shatskii.spring_in_action.controller;

import com.shatskii.spring_in_action.pojo.Ingredient;
import com.shatskii.spring_in_action.pojo.Taco;
import com.shatskii.spring_in_action.pojo.TacoOrder;
import com.shatskii.spring_in_action.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.shatskii.spring_in_action.pojo.Ingredient.Type;

import javax.validation.Valid;

@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    private final IngredientRepository repository;

    @Autowired
    public DesignTacoController(IngredientRepository repository) {
        this.repository = repository;
    }

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = repository.findAll();
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order() {
        return new TacoOrder();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping
    public String showDesignForm() {
        return "design";
    }

    @PostMapping
    public String processTaco(@Valid @ModelAttribute("taco") Taco taco, Errors errors,
                              @ModelAttribute("tacoOrder") TacoOrder tacoOrder) {
        tacoOrder.addTaco(taco);
        return "redirect:/orders/current";
    }

    private Iterable<Ingredient> filterByType(
            List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
