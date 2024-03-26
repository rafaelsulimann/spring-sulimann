package com.springsulimann.springsulimann.validators.telefone;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.springsulimann.springsulimann.utils.Regex;

public class TelefoneValidator implements ConstraintValidator<Telefone, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CELULAR);
    }

}
