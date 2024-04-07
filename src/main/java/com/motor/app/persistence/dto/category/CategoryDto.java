package com.motor.app.persistence.dto.category;

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
public class CategoryDto {

  @JsonInclude(value = Include.NON_NULL)
  private Long categoryId;

  @NotNull(message = MESSAGE)
  @NotBlank(message = MESSAGE)
  private String categoryName;

  private String categoryDescription;
}
