package com.itacademy.whitecollar.service.impl;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import com.itacademy.whitecollar.service.IShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ShopServiceImpl implements IShopService {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<ShopResponseDto> findAll() {
        return em.createQuery("from ShopResponseDto").getResultList();
    }

    @Override
    @Transactional
    public void create(ShopResponseDto shop) {
        if(shop.getId() != null && shop.getId() > 0){
            em.merge((shop));
        } else{
            em.persist(shop);
        }
    }

    @Override
    @Transactional
    public ShopResponseDto findOne(Long id) {
        return em.find(ShopResponseDto.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        em.remove(findOne(id));
    }
}
