package com.motor.app.exception;

import lombok.Getter;

/*
 * Clase que permite transportar los datos de la excepcion
 */
@Getter
public class GlobalException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private final Integer code;

  private final String message;

  public GlobalException(Integer code, String message) {
    super(message);
    this.code = code;
    this.message = message;
  }
}
