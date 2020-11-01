package com.itacademy.whitecollar.service;

import com.itacademy.whitecollar.dto.PictureResponseDto;

import java.util.List;

public interface IPictureService {

    public List<PictureResponseDto> findAll();

    public void create(PictureResponseDto picture, Long shopId);

    public PictureResponseDto findOne(Long id);

    public void delete(Long id);

    public List<PictureResponseDto> deleteByShopId(Long shop_id);

    public List<PictureResponseDto> findByShopId(Long shopId);

}


