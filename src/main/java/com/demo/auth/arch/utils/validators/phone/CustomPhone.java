package com.demo.auth.arch.utils.validators.phone;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CustomPhoneValidator.class)
@Documented
public @interface CustomPhone {

  String message() default " Expected minimal 5 digits";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}

