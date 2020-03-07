package com.example.demo.util;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorResponse {
  private String message;
  private int httpCode;
}
