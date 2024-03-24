package com.motor.app.service;

import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.UserDto;

public interface UserService {

  ResponseService<String> registerUser(UserDto userDto);

  ResponseService<String> login(String username, String password);

  ResponseService<String> updateUser(Long idUser);

  ResponseService<String> deleteUser(Long iduser);

}

