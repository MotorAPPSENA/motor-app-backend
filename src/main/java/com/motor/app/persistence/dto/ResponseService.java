package com.motor.app.persistence.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseService<T> {

  private String code;

  private String message;

  private T response;
}
