package com.springsulimann.springsulimann.validators.cep;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.springsulimann.springsulimann.utils.Regex;

public class CepValidator implements ConstraintValidator<Cep, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CEP);
    }

}
