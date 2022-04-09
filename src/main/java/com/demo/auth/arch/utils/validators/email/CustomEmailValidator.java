package com.demo.auth.arch.utils.validators.email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomEmailValidator implements ConstraintValidator<CustomEmail, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var pattern = "^([a-z]*)@dominio.cl$";
        return value.matches(pattern);
    }
    
}
