package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addPerson(@PathVariable Long id) {
        personService.delete(id);
    }
}
