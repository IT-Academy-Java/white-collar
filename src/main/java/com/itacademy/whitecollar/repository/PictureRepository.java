package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}