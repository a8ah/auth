package com.demo.auth.bussines.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;

import com.demo.auth.bussines.model.projection.UserSingUpProjection;
import com.demo.auth.bussines.model.projection.UserSingUpRequest;
import com.demo.auth.bussines.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class UserController {
    @Autowired
    UserService mUserService;
    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})    
    public UserSingUpProjection crear(@RequestBody @Valid UserSingUpRequest entity, Errors errors) throws Exception {
        if (errors.hasErrors()) {
            // Extract ConstraintViolation list from body errors
            List<ConstraintViolation<?>> violationsList = new ArrayList<>();
                for (ObjectError e : errors.getAllErrors()) {
                violationsList.add(e.unwrap(ConstraintViolation.class));
            }

            String exceptionMessage = "";
            
            // Construct a helpful message for each input violation
            for (ConstraintViolation<?> violation : violationsList) {
                exceptionMessage += violation.getPropertyPath() + " " + violation.getMessage() + ", ";
            }
            throw new Exception(String.format("Request input is invalid: %s", exceptionMessage));
        }

        try {
            return mUserService.singUpUser(entity);
        } catch (Exception ex) {
            throw  new Exception(ex.getMessage());
        }
    }

}
