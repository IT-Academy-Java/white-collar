package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ShopRepository implements IShopRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<ShopResponseDto> findAll() {
        return em.createQuery("from ShopResponseDto").getResultList();
    }

    @Override
    public void create(ShopResponseDto shop) {

    }

    @Override
    public ShopResponseDto findOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
