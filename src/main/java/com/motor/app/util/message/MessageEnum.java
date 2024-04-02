package com.motor.app.util.message;

import lombok.Getter;

/*
 * 
 */
public enum MessageEnum {

  ALREADY_EXIST(400, "¡El usuario %s ya existe  !"), 
  FIELD_NOT_NULL(400, "¡El %s no puede ser vacío!"),
  USER_NOT_FOUND(404, "¡Usuario no encontrado, Realice registro!"),
  FIELD_MANDATORY(400, "El campo '%s' es obligatorio!"),
  WRONG_PASSWORD(401, "¡Contraseña errada!");

  @Getter
  private int code;

  @Getter
  private String message;

  MessageEnum(int code, String message) {
    this.code = code;
    this.message = message;
  }
}
