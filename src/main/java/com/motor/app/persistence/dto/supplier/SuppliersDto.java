package com.motor.app.persistence.dto.supplier;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

/*
 * 
 */
@Data
@Builder
public class SuppliersDto {

  private static final String MESSAGE = "El campo '%s' no debe ser vacío o nulo";

  private Long supplierId;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String supplierName;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String supplierAddrest;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String citySuppliers;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String countrySuppliers;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String phoneSuppliers;

  @Email
  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String emailSuppliers;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String identifier;
}
