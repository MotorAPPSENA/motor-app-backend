package com.motor.app.util.validation;

import org.springframework.validation.BindingResult;
import com.motor.app.exception.GlobalException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 * 
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validation {

  public static void validateObject(BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      var error = String.format(bindingResult.getFieldError().getDefaultMessage(),
          bindingResult.getFieldError().getField());
      throw new GlobalException(400, error);
    }
  }
}
