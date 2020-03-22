package com.kingshuk.javabeanvalidation.employeedummyproject;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class EmployeeValidationTestHarness {

	public static void main(String[] args) {
		Employee employee = new Employee();

		EmployeeValidationTestHarness harness = new EmployeeValidationTestHarness();

		harness.printEmployee(employee);
	}

	public void printEmployee(Employee employee) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

		Validator validator = validatorFactory.getValidator();

		Set<ConstraintViolation<Employee>> violations = validator.validate(employee);

		if (violations.isEmpty()) {
			System.out.println(employee.getName() + " has a valid object");
		} else {
			violations.forEach(violation -> System.out.println(violation));
		}

	}

}
