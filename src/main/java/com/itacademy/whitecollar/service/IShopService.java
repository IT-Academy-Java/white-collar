package com.itacademy.whitecollar.service;

import com.itacademy.whitecollar.dto.ShopResponseDto;

import java.util.List;

public interface IShopService {

    public List<ShopResponseDto> findAll();

    public void create(ShopResponseDto shop);

    public ShopResponseDto findOne(Long id);

    public void delete(Long id);
}
