package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPictureRepository {

    public List<PictureResponseDto> findAll();

    public void create(PictureResponseDto picture);

    public PictureResponseDto findOne(Long id);

    public void delete(Long id);
}
