package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPictureRepository {

    // List all pictures
    public List<PictureResponseDto> findAll();

}
