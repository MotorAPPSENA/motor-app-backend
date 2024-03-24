package com.motor.app.persistence.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

  private Long idUSer;

  private String nameUser;

  private String lastName;

  private String ageUser;

  private String position;

  private String username;

  private String password;
}
