package com.motor.app.exception.handler;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.error.ResponseError;
import lombok.extern.slf4j.Slf4j;

/*
 * 
 */
@Slf4j
@RestControllerAdvice
public class Handler {

  @ExceptionHandler(value = {GlobalException.class})
  ResponseEntity<ResponseError> handlerGlobal(GlobalException ex) {

    log.error(ex.getMessage());

    var err = ResponseError.builder().code(ex.getCode()).message(ex.getMessage())
        .uuid(UUID.randomUUID().toString()).build();

    return new ResponseEntity<>(err, buildStatus(ex.getCode()));
  }

  private HttpStatus buildStatus(int code) {
    return HttpStatus.valueOf(code);
  }
}
