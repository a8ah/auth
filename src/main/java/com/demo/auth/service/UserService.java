package com.demo.auth.service;

import com.demo.auth.arch.service.BaseCrudService;
import com.demo.auth.model.entity.User;
import com.demo.auth.model.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseCrudService<User,UserRepository> {

    public UserService(UserRepository repository) {
        super(repository);
    }

    
}
