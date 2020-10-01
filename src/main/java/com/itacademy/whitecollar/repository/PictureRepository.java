package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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
    public List<PictureResponseDto> findByJob(String job) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        em.remove(findOne(id));
    }
}

