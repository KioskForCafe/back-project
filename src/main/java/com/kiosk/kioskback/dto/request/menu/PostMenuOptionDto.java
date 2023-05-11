package com.kiosk.kioskback.dto.request.menu;

import com.kiosk.kioskback.entity.OptionEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "메뉴 수정 옵션 Request Body")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostMenuOptionDto {
    @ApiModelProperty(value = "옵션 이름", required = true)
    @NotBlank
    private String optionName;

    @ApiModelProperty(value = "옵션 가격", required = true)
    @Min(0)
    private int optionPrice;
    
    public PostMenuOptionDto(OptionEntity optionEntity) {
        this.optionName = optionEntity.getOptionName();
        this.optionPrice = optionEntity.getOptionPrice();
    }
}