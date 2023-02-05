package com.nikitagupta06.orderservice.repository;

import com.nikitagupta06.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
