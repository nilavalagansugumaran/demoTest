package com.example.demoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class OrdersRepositoryTest {


    @Autowired OrdersRepository ordersRepository;

    @Test
    public void testFindOrders() {
        ordersRepository.save(new Orders(1l,"John Smith"));
        List<Orders> emps = ordersRepository.findByCustomerName("John Smith");
        assertEquals(1, emps.size());
    }

}