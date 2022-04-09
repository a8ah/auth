package com.demo.auth.service;

import java.time.LocalDateTime;
import java.util.UUID;

import com.demo.auth.arch.exceptions.CustomException;
import com.demo.auth.arch.service.BaseCrudService;
import com.demo.auth.model.entity.Phone;
import com.demo.auth.model.entity.User;
import com.demo.auth.model.projection.PhoneRequest;
import com.demo.auth.model.projection.UserSingUpProjection;
import com.demo.auth.model.projection.UserSingUpRequest;
import com.demo.auth.model.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseCrudService<User, UserRepository> {

    @Autowired
    PhoneService mPhoneService;

    public UserService(UserRepository repository) {
        super(repository);
    }

    public UserSingUpProjection singUpUser(UserSingUpRequest entity) throws Exception {

        try {

            var user = new User();
            user.setName(entity.getName());
            user.setEmail(entity.getEmail());
            user.setPassword(entity.getPassword());
            user.setActive(false);
            user.setLastLogin(LocalDateTime.now());
            user.setToken(UUID.randomUUID().toString());

            this.create(user);

            for (PhoneRequest phoneRequest : entity.getPhones()) {

                var phone = new Phone();

                phone.setUser(user);
                phone.setNumber(phoneRequest.getNumber());
                phone.setCityCode(phoneRequest.getCitycode());
                phone.setContryCode(phoneRequest.getCitycode());

                mPhoneService.create(phone);
            }

            return mRepository.findByIdAndDeletedFalse(user.getId());
        } catch (Exception e) {
            if(e.getLocalizedMessage().contains("[UK_6DOTKOTT2KJSP8VW4D0M25FB7]"))
            throw new CustomException();
            throw new Exception(e);
        }

    }

    // public Str
}
