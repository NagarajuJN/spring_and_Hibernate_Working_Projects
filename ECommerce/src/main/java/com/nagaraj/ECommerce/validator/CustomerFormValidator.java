package com.nagaraj.ECommerce.validator;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.internal.constraintvalidators.AbstractEmailValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.nagaraj.ECommerce.form.CustomerForm;

@Component
public class CustomerFormValidator implements Validator {

//   private EmailValidator emailValidator = EmailValidator.getInstance();

   // This validator only checks for the CustomerForm.
   @Override
   public boolean supports(Class<?> clazz) {
      return clazz == CustomerForm.class;
   }

   @Override
   public void validate(Object target, Errors errors) {
      CustomerForm custInfo = (CustomerForm) target;

      // Check the fields of CustomerForm.
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.customerForm.name");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.customerForm.email");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.customerForm.address");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "NotEmpty.customerForm.phone");

      AbstractEmailValidator<Email> emailValidator = null;
	if (!emailValidator.isValid(custInfo.getEmail(), null)) {
         errors.rejectValue("email", "Pattern.customerForm.email");
      }
   }

}
