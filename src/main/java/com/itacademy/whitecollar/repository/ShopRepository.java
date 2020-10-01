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
