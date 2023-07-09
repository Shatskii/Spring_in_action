package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TacoOrder, Integer> {
}
