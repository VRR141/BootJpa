package com.example.bootjpa.controller;

import com.example.bootjpa.domain.Person;
import com.example.bootjpa.repo.HibernateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    private final HibernateRepository repository;

    @GetMapping("/by-city")
    public ResponseEntity<List<Person>> getPersonsByCity(@RequestParam(name = "city") String city){
        return ResponseEntity.ok(repository.getPersonsByCity(city));
    }
}
