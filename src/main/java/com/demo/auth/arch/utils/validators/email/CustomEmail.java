package com.demo.auth.arch.utils.validators.email;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CustomEmailValidator.class)
@Documented
public @interface CustomEmail {

  String message() default " Email not match with defaul parameter (aaaa@dominio.cl)";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}

