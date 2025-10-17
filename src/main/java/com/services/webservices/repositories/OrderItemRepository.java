package com.services.webservices.repositories;

import com.services.webservices.entities.OrderItem;
import com.services.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
