package com.motor.app.service.impl;

import java.util.Base64;
import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.UserDto;
import com.motor.app.persistence.models.Users;
import com.motor.app.persistence.repository.UserRepository;
import com.motor.app.service.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {

  private final UserRepository repository;

  @Override
  public ResponseService<String> registerUser(UserDto userDto) {
    validateUser(userDto);
    var username = repository.buscarUsuario(userDto.getUsername());

    if (Objects.nonNull(username)) {
      throw new RuntimeException("¡El usuario " + username + " ya existe  !");
    }
    Users entity = new Users();
    entity.setNameUser(userDto.getNameUser());
    entity.setLastName(userDto.getLastName());
    entity.setAgeUser(userDto.getAgeUser());
    entity.setPassword(Base64.getEncoder().encodeToString(userDto.getPassword().getBytes()));
    entity.setPosition(userDto.getPosition());
    entity.setUsername(userDto.getUsername());
    entity.setRoleId(1L);
    repository.save(entity);


    return new ResponseService<>(HttpStatus.CREATED.name(), "¡Resgistro exitoso!",
        HttpStatus.CREATED.getReasonPhrase());
  }

  @Override
  public ResponseService<String> login(String username, String password) {
    return null;
  }

  @Override
  public ResponseService<String> updateUser(Long idUser) {
    return null;
  }

  @Override
  public ResponseService<String> deleteUser(Long iduser) {
    return null;
  }

  private void validateUser(UserDto dto) {
    validate(dto);
    validate(dto.getNameUser());
    validate(dto.getLastName());
    validate(dto.getAgeUser());
    validate(dto.getPosition());
    validate(dto.getUsername());
    validate(dto.getPassword());

  }

  private void validate(Object obj) {
    if (Objects.isNull(obj)) {
      throw new RuntimeException("¡Este campo no puede ser nulo!");

    }
  }

}
