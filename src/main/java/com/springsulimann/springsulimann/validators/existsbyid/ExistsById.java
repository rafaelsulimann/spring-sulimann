package com.springsulimann.springsulimann.validators.existsbyid;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = ExistsByIdValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsById {

    String message() default "Recurso não encontrado";
    Class<?>[] groups() default {}; //PADRÃO
    Class<? extends Payload>[] payload() default {}; //PADRÃO
    String fieldName();
    Class<?> domainClass();

}
