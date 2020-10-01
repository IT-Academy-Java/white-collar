package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IShopRepository {

    public List<ShopResponseDto> findAll();

    public void create(ShopResponseDto shop);

    public ShopResponseDto findOne(Long id);

    public void delete(Long id);
}
