package com.motor.app.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.user.UserDto;
import com.motor.app.service.user.UserService;
import com.motor.app.util.validation.ValidationDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;

/*
 * http://localhost:8080/api/users/register
 */
@RequestMapping(path = "/api/users")
@RestController
@RequiredArgsConstructor
class UsersController {

  private final UserService service;

  /*
   * 
   */
  @PostMapping(path = "register", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> registerUser(@Valid @RequestBody UserDto userdto,
      BindingResult bindingResult) {
    ValidationDto.validateObject(bindingResult);
    var response = service.registerUser(userdto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  /*
   * 
   */
  @GetMapping(path = "login", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> login(
      @Valid @RequestParam(name = "username", required = true) @NotBlank String username,
      @Valid @RequestParam(name = "password", required = true) @NotBlank String password) {
    var response = service.login(username, password);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  /*
   * 
   */
  @PutMapping(path = "update/{idUser}", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> updateUser(@PathVariable(name = "idUser") Long idUser,
      @RequestBody UserDto userDto) {
    var response = service.updateUser(idUser, userDto);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  /*
   * 
   */
  @DeleteMapping(path = "delete/{idUser}", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> deleteUser(@PathVariable(name = "idUser") Long idUser) {
    var response = service.deleteUser(idUser);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}


