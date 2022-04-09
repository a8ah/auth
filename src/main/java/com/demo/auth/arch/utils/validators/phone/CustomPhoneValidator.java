package com.demo.auth.arch.utils.validators.phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomPhoneValidator implements ConstraintValidator<CustomPhone, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var pattern = "([1-9])([0-9]{4,})";
        return value.matches(pattern);
    }
    
}
