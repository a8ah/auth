package com.demo.auth.arch.utils.validators.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustompasswordValidator implements ConstraintValidator<CustomPassword, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var pattern = "^([A-Z])([a-z]*)([0-9]{2})$";
        return value.matches(pattern);
    }
    
}
