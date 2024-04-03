package com.motor.app.persistence.dto.user;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

  private static final String MESSAGE = "El campo '%s' no debe ser vacío o nulo";

  private Long idUSer;

  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String name;

  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String lastname;

  @Min(value = 16, message = "La edad minima es 16")
  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String age;

  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String position;

  private Long roleId;

  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String username;

  @NotBlank(message = MESSAGE)
  @NotNull(message = MESSAGE)
  private String password;
}
