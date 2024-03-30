package com.motor.app.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.UserDto;
import com.motor.app.service.UserService;
import com.motor.app.util.validation.Validation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*
 * http://localhost:8080/api/users/register
 */
@RequestMapping(path = "/api/users")
@RestController
@RequiredArgsConstructor
class UsersController {

  private final UserService service;

  @PostMapping(path = "register", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> registerUser(@Valid @RequestBody UserDto userdto,
      BindingResult bindingResult) {
    Validation.validateObject(bindingResult);
    var response = service.registerUser(userdto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @GetMapping(path = "login", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> login(
      @RequestParam(name = "username", required = true) String username,
      @RequestParam(name = "password", required = true) String password) {
    var response = service.login(username, password);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}


