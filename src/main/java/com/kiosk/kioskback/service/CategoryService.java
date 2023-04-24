package com.kiosk.kioskback.service;

import java.util.List;

import com.kiosk.kioskback.dto.request.category.PatchCategoryDto;
import com.kiosk.kioskback.dto.request.category.PostCategoryDto;
import com.kiosk.kioskback.dto.response.ResponseDto;
import com.kiosk.kioskback.dto.response.category.DeleteCategoryResponseDto;
import com.kiosk.kioskback.dto.response.category.GetListResponseDto;
import com.kiosk.kioskback.dto.response.category.PatchCategoryResponseDto;
import com.kiosk.kioskback.dto.response.category.PostCategoryResponseDto;

public interface CategoryService {
    
    public ResponseDto<List<GetListResponseDto>> getList();
    public ResponseDto<PostCategoryResponseDto> postCategory(String userId, PostCategoryDto dto);
    public ResponseDto<PatchCategoryResponseDto> patchCategory(String userId, PatchCategoryDto dto);
    public ResponseDto<DeleteCategoryResponseDto> deleteCategory(String userId, int menuCategoryId);
}
