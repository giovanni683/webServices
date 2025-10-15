package com.services.webservices.repositories;

import com.services.webservices.entities.Order;
import com.services.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
