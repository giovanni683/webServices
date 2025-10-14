package com.services.webservices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.webservices.entities.User;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserResource service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll().getBody();
        return ResponseEntity.ok().body(list);
    }
}
