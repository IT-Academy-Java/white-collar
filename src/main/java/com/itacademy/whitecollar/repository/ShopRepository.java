package com.itacademy.whitecollar.repository;

import com.itacademy.whitecollar.dto.ShopResponseDto;
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
public class ShopRepository implements IShopRepository, JpaRepository<ShopResponseDto, Long>{

    @Override
    public List<ShopResponseDto> findAll() {
        return null;
    }

    @Override
    public List<ShopResponseDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ShopResponseDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ShopResponseDto> findAllById(Iterable<Long> longs) {
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
    public void delete(ShopResponseDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShopResponseDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ShopResponseDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ShopResponseDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShopResponseDto> findById(Long aLong) {
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
    public <S extends ShopResponseDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<ShopResponseDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ShopResponseDto getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends ShopResponseDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ShopResponseDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ShopResponseDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ShopResponseDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ShopResponseDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ShopResponseDto> boolean exists(Example<S> example) {
        return false;
    }
}

