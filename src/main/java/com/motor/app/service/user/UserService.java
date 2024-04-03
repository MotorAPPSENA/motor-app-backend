package com.motor.app.service.user;

import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.user.UserDto;

public interface UserService {

  ResponseService<String> registerUser(UserDto userDto);

  ResponseService<String> login(String username, String password);

  ResponseService<String> updateUser(Long idUser, UserDto userDto);

  ResponseService<String> deleteUser(Long iduser);
}

