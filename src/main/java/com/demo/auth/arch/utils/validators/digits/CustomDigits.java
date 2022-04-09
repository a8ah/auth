package com.demo.auth.arch.utils.validators.digits;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CustomDigitsValidator.class)
@Documented
public @interface CustomDigits {

  String message() default " Only Digits are acepted";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}

