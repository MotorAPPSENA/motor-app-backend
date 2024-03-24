package com.motor.app.util.validation;

import java.util.Objects;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.UserDto;
import com.motor.app.util.message.MessageEnum;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 * 
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validation {

  public static void validateUser(UserDto dto) {
    validate(dto, "object");
    validate(dto.getNameUser(), "name");
    validate(dto.getLastName(), "lastname");
    validate(dto.getAgeUser(), "age");
    validate(dto.getPosition(), "position");
    validate(dto.getUsername(), "username");
    validate(dto.getPassword(), "password");
  }

  private static void validate(Object obj, String field) {
    if (Objects.isNull(obj)) {
      var message = String.format(MessageEnum.FIELD_NOT_NULL.getMessage(), field);
      throw new GlobalException(MessageEnum.FIELD_NOT_NULL.getCode(), message);

    }
  }
}
