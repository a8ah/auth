package com.demo.auth.model.repository;

import java.util.Optional;
import java.util.UUID;

import com.demo.auth.arch.repository.EntityRepository;
import com.demo.auth.model.entity.User;
import com.demo.auth.model.projection.UserSingUpProjection;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends EntityRepository<User> {
    
    UserSingUpProjection findByIdAndDeletedFalse(UUID id);

    Optional<User> findByName(String username);

    boolean isActive(UUID id);

    boolean existsByEmail(String email);
}
