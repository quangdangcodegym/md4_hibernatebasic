package com.codegym.validator;

import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import java.util.Set;

@Component
public class WebAppValidator implements Validator {

    public void setSpringvalidator(Set<Validator> springvalidators) {
        this.springvalidators = springvalidators;
    }

    private Set<Validator> springvalidators;

    @Autowired
    private  javax.validation.Validator  beanValidators;


    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Set<ConstraintViolation<Object>> beans = this.beanValidators.validate(target);

        for(ConstraintViolation<Object> obj: beans){
            errors.rejectValue(obj.getPropertyPath().toString(),
                    obj.getMessageTemplate(), obj.getMessage());
        }
        for(Validator v: this.springvalidators){
            v.validate(target, errors);
        }
    }
}
