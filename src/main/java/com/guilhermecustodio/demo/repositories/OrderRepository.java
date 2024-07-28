package com.guilhermecustodio.demo.repositories;

import com.guilhermecustodio.demo.entities.Order;
import com.guilhermecustodio.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
