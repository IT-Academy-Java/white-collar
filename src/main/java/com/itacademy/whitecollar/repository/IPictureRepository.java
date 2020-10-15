package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IPictureRepository {

    public List<PictureResponseDto> findAll();

    public void create(PictureResponseDto picture, Long shopId);

    public PictureResponseDto findOne(Long id);

    public void delete(Long id);

    public List<PictureResponseDto> findByShopId(Long shopId);

    public Optional<PictureResponseDto> findByIdAndShopId(Long id, Long shopId);
}
