package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class PictureRepository implements IPictureRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<PictureResponseDto> findAll() {
        return em.createQuery("from PictureResponseDto").getResultList();
    }

    @Override
    @Transactional
    public void create(PictureResponseDto picture) {
        if(picture.getId() != null && picture.getId() > 0){
            em.merge((picture));
        } else{
            em.persist(picture);
        }
    }

    @Override
    @Transactional
    public PictureResponseDto findOne(Long id) {
        return em.find(PictureResponseDto.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        em.remove(findOne(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PictureResponseDto> findByShopId(Long shopId) {
        return null;
    }

    @Override
    public Optional<PictureResponseDto> findByIdAndShopId(Long id, Long shopId) {
        return Optional.empty();
    }

}
