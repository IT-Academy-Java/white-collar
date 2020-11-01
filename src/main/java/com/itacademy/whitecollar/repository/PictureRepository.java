package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class PictureRepository implements IPictureRepository, JpaRepository<PictureResponseDto, Long> {

    @Override
    public List<PictureResponseDto> findAll() {
        return null;
    }

    @Override
    public List<PictureResponseDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PictureResponseDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PictureResponseDto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PictureResponseDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PictureResponseDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PictureResponseDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PictureResponseDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PictureResponseDto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PictureResponseDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PictureResponseDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PictureResponseDto getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends PictureResponseDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PictureResponseDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PictureResponseDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PictureResponseDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PictureResponseDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PictureResponseDto> boolean exists(Example<S> example) {
        return false;
    }
}
