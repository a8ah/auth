package com.demo.auth.arch.utils.validators.password;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CustompasswordValidator.class)
@Documented
public @interface CustomPassword {

  String message() default "{ La clave proporcionada no coincide con el parametro (Mayuscula, letras minúsculas, y dos numeros)}";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}

