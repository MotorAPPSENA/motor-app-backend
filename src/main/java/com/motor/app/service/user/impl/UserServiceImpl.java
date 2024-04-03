package com.motor.app.service.user.impl;

import java.util.Base64;
import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.user.UserDto;
import com.motor.app.persistence.models.Users;
import com.motor.app.persistence.repository.user.UserRepository;
import com.motor.app.service.user.UserService;
import com.motor.app.util.message.MessageEnum;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {

  private final UserRepository repository;

  @Override
  public ResponseService<String> registerUser(UserDto userDto) {

    var username = repository.buscarUsuario(userDto.getUsername());

    if (Objects.nonNull(username)) {
      throw new GlobalException(MessageEnum.USER_ALREADY_EXIST.getCode(),
          String.format(MessageEnum.USER_ALREADY_EXIST.getMessage(), userDto.getUsername()));
    }
    repository.save(buildEntity(userDto));

    return new ResponseService<>(HttpStatus.CREATED.name(), MessageEnum.SUCCESSFULLY.getMessage(),
        HttpStatus.CREATED.getReasonPhrase());
  }

  @Override
  public ResponseService<String> login(String username, String password) {
    var passCipher = Base64.getEncoder().encodeToString(password.getBytes());
    var user = repository.buscarUsuarioPorUserName(username);
    if (Objects.isNull(user)) {
      throw new GlobalException(MessageEnum.USER_NOT_FOUND.getCode(),
          MessageEnum.USER_NOT_FOUND.getMessage());
    }
    if (!passCipher.equals(user.getPassword())) {
      throw new GlobalException(MessageEnum.WRONG_PASSWORD.getCode(),
          MessageEnum.WRONG_PASSWORD.getMessage());
    }
    return new ResponseService<>(String.valueOf(HttpStatus.OK.value()),
        "¡Inicio de sesión satisfactorio!", HttpStatus.OK.getReasonPhrase());

  }

  @Override
  public ResponseService<String> updateUser(Long idUser, UserDto userDto) {

    var findUser = repository.findById(idUser)
        .orElseThrow(() -> new GlobalException(MessageEnum.USER_NOT_FOUND.getCode(),
            MessageEnum.USER_NOT_FOUND.getMessage()));

    findUser.setIdUSer(idUser);
    findUser.setNameUser(userDto.getName());
    findUser.setLastName(userDto.getLastname());
    findUser.setAgeUser(userDto.getAge());
    findUser.setPosition(userDto.getPosition());
    findUser.setRoleId(Objects.isNull(userDto.getRoleId()) ? 1L : userDto.getRoleId());
    findUser.setUsername(userDto.getUsername());
    findUser.setPassword(Base64.getEncoder().encodeToString(userDto.getPassword().getBytes()));

    repository.save(findUser);
    return new ResponseService<>(String.valueOf(HttpStatus.OK.value()), "¡Actualización exitosa!",
        HttpStatus.OK.getReasonPhrase());
  }

  @Override
  public ResponseService<String> deleteUser(Long idUser) {

    var findUser = repository.findById(idUser)
        .orElseThrow(() -> new GlobalException(MessageEnum.USER_NOT_FOUND.getCode(),
            MessageEnum.USER_NOT_FOUND.getMessage()));

    repository.deleteById(findUser.getIdUSer());

    return new ResponseService<>(String.valueOf(HttpStatus.OK.value()), "¡Eliminación exitosa!",
        HttpStatus.OK.getReasonPhrase());
  }

  /*
   * 
   */
  private Users buildEntity(UserDto userDto) {
    Users entity = new Users();
    entity.setNameUser(userDto.getName());
    entity.setLastName(userDto.getLastname());
    entity.setAgeUser(userDto.getAge());
    entity.setPassword(Base64.getEncoder().encodeToString(userDto.getPassword().getBytes()));
    entity.setPosition(userDto.getPosition());
    entity.setUsername(userDto.getUsername());
    entity.setRoleId(1L);
    return entity;
  }
}