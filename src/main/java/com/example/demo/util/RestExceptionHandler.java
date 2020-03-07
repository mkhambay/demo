package com.example.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(value = {Exception.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ErrorResponse generalException(Exception e) {
    return ErrorResponse.builder()
        .message("General error occurred")
        .httpCode(HttpStatus.BAD_REQUEST.value())
        .build();
  }
}
