package com.kiosk.kioskback.dto.request.category;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "카테고리 수정 Request Body")
@Data
@NoArgsConstructor
public class PatchCategoryDto {

    @ApiModelProperty(value = "카테고리 식별 번호", example = "1", required = true)
    @Min(1)
    private int menuCategoryId;

    @ApiModelProperty(value = "카테고리 이름", example = "Category Name", required = true)
    @NotBlank
    @Max(45)
    private String menuCategoryName;

    @ApiModelProperty(value = "카테고리 우선순위", example = "1", required = true)
    @Min(1)
    private int menuCategoryPriority;
    
}
