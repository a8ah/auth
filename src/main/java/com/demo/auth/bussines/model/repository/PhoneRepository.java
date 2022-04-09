package com.demo.auth.bussines.model.repository;

import com.demo.auth.arch.repository.EntityRepository;
import com.demo.auth.bussines.model.entity.Phone;

import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository  extends EntityRepository<Phone> {
    
}
