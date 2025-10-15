package com.services.webservices.services;

import com.services.webservices.entities.Order;
import com.services.webservices.entities.User;
import com.services.webservices.repositories.OrderRepository;
import com.services.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<User> findAll() {

        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
