package com.example.demoTest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Long> {

    List<Orders> findByCustomerName(String customerName);
}
