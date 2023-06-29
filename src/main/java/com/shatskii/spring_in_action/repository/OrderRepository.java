package com.shatskii.spring_in_action.repository;

import com.shatskii.spring_in_action.pojo.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
