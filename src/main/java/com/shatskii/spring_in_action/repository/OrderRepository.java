package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.TacoOrder;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Integer> {

}
