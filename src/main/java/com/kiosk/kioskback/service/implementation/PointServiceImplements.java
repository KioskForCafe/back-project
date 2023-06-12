package com.kiosk.kioskback.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiosk.kioskback.common.constants.ResponseMessage;
import com.kiosk.kioskback.dto.request.point.PostPointDto;
import com.kiosk.kioskback.dto.response.ResponseDto;
import com.kiosk.kioskback.dto.response.point.PostPointResponseDto;
import com.kiosk.kioskback.entity.PointEntity;
import com.kiosk.kioskback.repository.PointRepository;
import com.kiosk.kioskback.service.PointService;

@Service
public class PointServiceImplements implements PointService {

    @Autowired PointRepository pointRepository;

    @Override
    public ResponseDto<PostPointResponseDto> postPoint(PostPointDto dto) {
        PostPointResponseDto data = null;
        String telNumber = dto.getTelNumber();

        try {
            PointEntity pointEntity = pointRepository.findByTelNumber(telNumber);
            if(pointEntity == null){
                pointEntity = new PointEntity(dto);
            }else{
                int currentPoint = pointEntity.getCurrentPoint();
                pointEntity = new PointEntity(currentPoint, dto);
            }

            pointRepository.save(pointEntity);

            data = new PostPointResponseDto(pointEntity);
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }

        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
    }
}
    
