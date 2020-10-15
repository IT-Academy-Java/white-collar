package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IPictureRepository {

    public List<PictureResponseDto> findAll();

    public void create(PictureResponseDto picture, Long shopId);

    public PictureResponseDto findOne(Long id);

    public void delete(Long id);

   // @Modifying
   // @Query("delete from PictureResponseDto p where p.shop_id=:shop_id")
    //public void deleteByShopId(Long shop_id);

    //@Query("delete from PictureResponseDto p where p.shop_id=:shop_id")
    public List<PictureResponseDto> deleteByShopId(Long shop_id);

    public List<PictureResponseDto> findByShopId(Long shopId);

    public Optional<PictureResponseDto> findByIdAndShopId(Long id, Long shopId);
}
