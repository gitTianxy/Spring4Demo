package org.spring.demo.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class NameValidator implements ConstraintValidator<NameValidation, String> {

    private static final Pattern ADMIN_PATTERN = Pattern.compile("kevin_*");

    @Override
    public void initialize(NameValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        return ADMIN_PATTERN.matcher(value).matches();
    }
}
