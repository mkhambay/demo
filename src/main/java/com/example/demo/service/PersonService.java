package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {

  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public void execute(String name) {
    log.debug("In Test Service");
  }

  public String getServiceName() {
    return "PersonService";
  }

  public Person getById(Long personId) {
    return personRepository.findById(personId).orElseGet(Person::new);
  }

  public Person save(Person person) {
    return personRepository.save(person);
  }

  public void delete(Long personId) {
    personRepository.deleteById(personId);
  }
}
