package com.motor.app.util.validation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import com.motor.app.exception.GlobalException;
import com.motor.app.util.message.MessageEnum;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidationDto {

  public static void validateObject(BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      messageException(bindingResult.getFieldError());
    }
  }

  /*
   * 
   */
  private static void messageException(FieldError fieldError) {
    if (fieldError != null) {
      var error = String.format(fieldError.getDefaultMessage(), fieldError.getField());
      throw new GlobalException(MessageEnum.FIELD_NOT_NULL.getCode(), error);
    }
  }
}
