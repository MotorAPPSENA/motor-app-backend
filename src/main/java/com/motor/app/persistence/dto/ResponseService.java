package com.motor.app.persistence.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseService<T> {

  private String codigo;

  private String mensaje;

  private T respuesta;
}
