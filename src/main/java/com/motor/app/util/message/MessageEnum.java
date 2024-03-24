package com.motor.app.util.message;

import lombok.Getter;

/*
 * 
 */
public enum MessageEnum {

  ALREADY_EXIST(400, "¡El usuario %s ya existe  !"), 
  FIELD_NOT_NULL(400, "¡El %s no puede ser nulo!");

  @Getter
  private int code;

  @Getter
  private String message;

  MessageEnum(int code, String message) {
    this.code = code;
    this.message = message;
  }
}
