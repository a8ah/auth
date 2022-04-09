package com.demo.auth.arch.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public CustomException() {
      super("Email already exist");
  }
}
