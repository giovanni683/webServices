package com.services.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
