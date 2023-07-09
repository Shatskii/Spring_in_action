package com.shatskii.spring_in_action;

import com.shatskii.spring_in_action.pojo.TacoOrder;
import com.shatskii.spring_in_action.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInActionApplicationTests {
    @Autowired
    private OrderRepository repository;

    @Test
    void contextLoads() {
        TacoOrder order = repository.findById(1).get();
        repository.delete(order);
    }

}
