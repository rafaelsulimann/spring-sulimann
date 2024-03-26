package com.springsulimann.springsulimann.validators.telefone;

import org.springframework.util.StringUtils;

import com.springsulimann.springsulimann.utils.Regex;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TelefoneValidator implements ConstraintValidator<Telefone, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CELULAR);
    }

}
