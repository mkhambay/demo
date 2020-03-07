package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestServiceTest {

  private TestService testService;

  @BeforeEach
  void setUp() {
    testService = new TestService();
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void execute() {
    testService.execute("Test");
  }

  @Test
  void getName() {
    String name = testService.getServiceName();
    assertNotNull(name);
  }
}