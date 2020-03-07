package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class PersonServiceTest {

  private PersonService personService;
  @Mock
  private PersonRepository personRepository;

  @BeforeEach
  void setUp() {
    personService = new PersonService(personRepository);
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void execute() {
    personService.execute("Test");
  }

  @Test
  void getName() {
    String name = personService.getServiceName();
    assertNotNull(name);
  }
}