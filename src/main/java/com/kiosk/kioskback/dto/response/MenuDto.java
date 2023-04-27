package com.kiosk.kioskback.dto.response;

import java.util.List;

import com.kiosk.kioskback.dto.request.menu.PatchMenuDto;
import com.kiosk.kioskback.entity.MenuEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "메뉴 정보 Format")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {

    @ApiModelProperty(value = "카테고리 번호", required = true)
    private int categoryId;

    @ApiModelProperty(value = "메뉴 번호", required = true)
    private int menuId;

    @ApiModelProperty(value = "메뉴 이름", required = true)
    private String menuName;

    @ApiModelProperty(value = "메뉴 가격", required = true)
    private int menuPrice;

    @ApiModelProperty(value = "메뉴 이미지", required = false)
    private String menuImgUrl;

    @ApiModelProperty(value = "메뉴 상태(품절/판매)", required = true)
    private boolean menuState;

    @ApiModelProperty(value = "매장 번호", required = true)
    private int storeId;

    @ApiModelProperty(value = "옵션 리스트", required = false)
    private List<OptionDto> optionList;

    public MenuDto(MenuEntity menuEntity) {
        this.categoryId = menuEntity.getCategoryId();
        this.menuId = menuEntity.getMenuId();
        this.menuName = menuEntity.getMenuName();
        this.menuPrice = menuEntity.getMenuPrice();
        this.menuImgUrl = menuEntity.getMenuImg();
        this.menuState = menuEntity.isMenuState();
        this.storeId = menuEntity.getStoreId();
    }
    
}
