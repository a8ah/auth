package com.demo.auth.arch.utils.validators.digits;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomDigitsValidator implements ConstraintValidator<CustomDigits, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var pattern = "(\\d+)*";
        return value.matches(pattern);
    }
    
}
