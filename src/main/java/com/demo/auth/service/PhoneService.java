package com.demo.auth.service;

import com.demo.auth.arch.service.BaseCrudService;
import com.demo.auth.model.entity.Phone;
import com.demo.auth.model.repository.PhoneRepository;

import org.springframework.stereotype.Service;

@Service
public class PhoneService extends BaseCrudService<Phone,PhoneRepository> {

    public PhoneService(PhoneRepository repository) {
        super(repository);
    }
    
}
