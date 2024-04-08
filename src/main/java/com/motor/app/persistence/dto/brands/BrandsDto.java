package com.motor.app.persistence.dto.brands;

import static com.motor.app.util.constans.Constants.MESSAGE;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandsDto {

  @JsonInclude(value = Include.NON_NULL)
  private Long brandsId;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String brandName;

  private String countryOriginBrand;

  private String foundingYearBrand;

  private String webSiteBrand;

  private String descriptionBrand;

  private String logouUrl;

}
