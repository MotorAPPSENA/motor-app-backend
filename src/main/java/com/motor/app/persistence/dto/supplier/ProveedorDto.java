package com.motor.app.persistence.dto.supplier;

import static com.motor.app.util.constans.Constants.MESSAGE;
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
public class ProveedorDto {

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
