package com.shatskii.spring_in_action.controller;

import com.shatskii.spring_in_action.entity.Roles;
import com.shatskii.spring_in_action.entity.User;
import com.shatskii.spring_in_action.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(@ModelAttribute("user") User user) {
        user.setRolesList(Arrays.asList(new Roles("ROLE_USER")));
        userRepository.save(user.encodePassword(passwordEncoder));
        return "redirect:/login";
    }
}
