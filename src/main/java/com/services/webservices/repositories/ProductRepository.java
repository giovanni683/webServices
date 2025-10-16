package com.services.webservices.repositories;

import com.services.webservices.entities.Category;
import com.services.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
