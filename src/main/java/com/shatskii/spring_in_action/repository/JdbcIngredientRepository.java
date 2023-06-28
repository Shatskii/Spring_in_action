package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Ingredient> findAll() {
        return jdbcTemplate.query("SELECT * FROM ingredient", this::rowMapper);
    }

    @Override
    public Optional<Ingredient> findById(String id) {
        List<Ingredient> ingredientList = jdbcTemplate.query("SELECT * FROM ingredient WHERE id=?", this::rowMapper, id);
        return ingredientList.isEmpty() ? Optional.empty() : ingredientList.stream().findAny();
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        jdbcTemplate.update("INSERT INTO ingredient VALUES(?,?,?)",
                ingredient.getId(), ingredient.getName(), ingredient.getType());
        return ingredient;
    }

    private Ingredient rowMapper(ResultSet resultSet, int rowNum) throws SQLException {
        Ingredient ingredient = new Ingredient();
        ingredient.setId(resultSet.getString("id"));
        ingredient.setName(resultSet.getString("name"));
        ingredient.setType(Ingredient.Type.valueOf(resultSet.getString("type")));
        return ingredient;
    }
}
