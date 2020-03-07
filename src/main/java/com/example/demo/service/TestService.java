package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

  public void execute(String name) {
    log.debug("In Test Service");
  }

  public String getServiceName() {
    return "TestService";
  }
}
