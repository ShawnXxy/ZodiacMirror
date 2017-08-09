package com.shawnxxy.domain.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.shawnxxy.domain.entity.ZodiacInfoEntity;

@Transactional
public interface ZodiacInfoRepository extends CrudRepository<ZodiacInfoEntity, String> {

}
