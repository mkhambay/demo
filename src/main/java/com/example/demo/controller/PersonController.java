package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService testService) {
        this.personService = testService;
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return personService.getById(id);
    }

    @PostMapping
    public Person addPerson(Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void addPerson(@PathVariable Long id) {
        personService.delete(id);
    }
}
