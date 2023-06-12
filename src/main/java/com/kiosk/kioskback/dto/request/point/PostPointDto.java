package com.kiosk.kioskback.dto.request.point;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostPointDto {
    @NotBlank
    @Length(min=11, max=13)
    private String telNumber;
    @Min(0)
    private int value;
    @NotNull
    private Boolean type;
}
