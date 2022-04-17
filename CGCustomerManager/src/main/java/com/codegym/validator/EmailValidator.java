package com.codegym.validator;

import com.codegym.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EmailValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        //ValidationUtils.rejectIfEmpty(errors, "firstName", "email.exist");

        if(!customer.getEmail().contains("codegym.vn")){
            System.out.println("CGH - EmailValidator: "  + customer.getEmail());
            errors.rejectValue("email", "email.notexist");
        }
    }
}
