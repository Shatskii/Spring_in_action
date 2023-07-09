package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Integer> {
}
