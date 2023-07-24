package com.shatskii.spring_in_action;

import com.shatskii.spring_in_action.entity.User;
import com.shatskii.spring_in_action.entity.Roles;
import com.shatskii.spring_in_action.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;


@SpringBootTest
class SpringInActionApplicationTests {
    @Autowired
    private UserRepository repository;

    @Test
    void contextLoads() {
        User user = new User("Alex", "password",
                "Alexandr", "Kamal", "Kazan",
                "Tatarstan", "123", "1231244");
        Roles roles = new Roles("ROLE_USER");
        user.setRolesList(Arrays.asList(roles));
        repository.save(user);
    }

}
