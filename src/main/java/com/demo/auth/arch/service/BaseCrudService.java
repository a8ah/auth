package com.demo.auth.arch.service;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import com.demo.auth.arch.entity.Entity;
import com.demo.auth.arch.repository.EntityRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BaseCrudService<T extends Entity, R extends EntityRepository<T>> {
  protected final Log logger = LogFactory.getLog(this.getClass());

  protected final R mRepository;

  public BaseCrudService(R repository) {
    this.mRepository = repository;
  }

  @Transactional
  public boolean create(T entity) {    
    this.save(entity);
    return true;
  }

  @Transactional
  public boolean modifi(UUID id, T entity) {
    if (!mRepository.existsById(id)) {
      return false;
    }

    entity.setId(id);
    this.save(entity);

    return true;
  }

  @Transactional
  public boolean delete(UUID id) {
    final T entidad = mRepository.findById(id).orElse(null);
    try {
      mRepository.delete(entidad);
    } catch (Exception ex) {
      logger.error(ex);
      throw new IllegalArgumentException("Entity can not be deleted, already in use");
    }

    return true;
  }

  @Transactional
  public boolean softdelete(UUID id) {
    final T entity = mRepository.findById(id).orElse(null);
    try {
      entity.setDeleted(true);
      this.save(entity);
    } catch (Exception ex) {
      logger.error(ex);
      throw new IllegalArgumentException("La entidad no se puede eliminar porque está siendo usada");
    }

    return true;
  }

  // public Page<T> buscar(Specification<T> specification, Pageable page) {
  //   return mRepository.findAll(specification, page);
  // }

  // public List<T> obtenerTodos(Specification<T> specification) {
  //   return mRepository.findAll(specification);
  // }

  public List<T> getAll() {
    return mRepository.findAll();
  }

  
  public Object details(UUID id) {
    return mRepository.findById(id).orElse(null);
  }

  public T obtener(UUID id) {
    return mRepository.findById(id).orElse(null);
  }

  

  // public List<T> buscarTodos(Specification<T> specification) {
  //   return mRepository.findAll(specification);
  // }

  public void save(T entity) {
    if (entity.getId() == null) {
      entity.setDeleted(false);
      entity.setCreated(LocalDateTime.now());
    } else {
      entity.setModifited(LocalDateTime.now());
    }

    mRepository.save(entity);
  }

}
