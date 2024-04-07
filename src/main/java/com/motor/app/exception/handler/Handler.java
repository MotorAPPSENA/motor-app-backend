package com.motor.app.exception.handler;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.error.ResponseError;
import com.motor.app.util.message.MessageEnum;
import lombok.extern.slf4j.Slf4j;

/*
 * Controlador de excepciones
 */
@Slf4j
@RestControllerAdvice
public class Handler {

  /*
   * Metodo que captura la excepcion GlobalException (personalizado)
   */
  @ExceptionHandler(value = {GlobalException.class})
  ResponseEntity<ResponseError> handlerGlobal(GlobalException ex) {

    log.error(ex.getMessage(), ex);

    var err = ResponseError.builder().code(ex.getCode()).message(ex.getMessage())
        .uuid(UUID.randomUUID().toString()).build();

    return new ResponseEntity<>(err, buildStatus(ex.getCode()));
  }

  /*
   * 
   */
  @ExceptionHandler(value = {MissingServletRequestParameterException.class})
  ResponseEntity<ResponseError> handlerErrorParams(MissingServletRequestParameterException ex) {
    log.error(ex.getMessage(), ex);

    var message = String.format(MessageEnum.FIELD_MANDATORY.getMessage(), ex.getParameterName());

    var err = ResponseError.builder().code(ex.getStatusCode().value()).message(message)
        .uuid(UUID.randomUUID().toString()).build();

    return new ResponseEntity<>(err, buildStatus(ex.getStatusCode().value()));
  }

  /*
   * 
   */
  @ExceptionHandler(value = {HandlerMethodValidationException.class})
  ResponseEntity<ResponseError> handlerErrorParamsBlank(HandlerMethodValidationException ex) {

    log.error(ex.getMessage(), ex);

    var field = getField(ex.getAllErrors());

    var message = String.format(MessageEnum.FIELD_NOT_NULL.getMessage(), field);

    var err = ResponseError.builder().code(ex.getStatusCode().value()).message(message)
        .uuid(UUID.randomUUID().toString()).build();

    return new ResponseEntity<>(err, buildStatus(ex.getStatusCode().value()));
  }

  /*
   * 
   */
  private HttpStatus buildStatus(int code) {
    return HttpStatus.valueOf(code);
  }

  /*
   * 
   */
  private String getField(List<? extends MessageSourceResolvable> listMessages) {

    var atomicField = new AtomicReference<String>();

    listMessages.forEach(e -> {
      for (Object object : e.getArguments()) {
        var field = (DefaultMessageSourceResolvable) object;
        atomicField.set(field.getDefaultMessage());
      }
      return;
    });
    return atomicField.get();
  }
}
