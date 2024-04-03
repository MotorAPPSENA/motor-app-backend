package com.motor.app.persistence.dto.error;

import lombok.Builder;
import lombok.Getter;

/*
 * 
 */
@Getter
@Builder
public class ResponseError {

  private String uuid;

  private Integer code;

  private String message;
}
