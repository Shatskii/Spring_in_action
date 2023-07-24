package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String name);
}
