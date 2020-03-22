package com.kingshuk.javabeanvalidation.employeedummyproject;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@NotNull(message = "MyMessaage: Name can't be null")
	@Size(max = 10, message="Name can't be larger than 10")
	private String name;

	@NotNull(message = "MyMessaage: Email address can't be null")
	@Size(max= 20, message="Email address can't be larger than 20")
	//@Pattern(regexp=".+@.+\\.[a-z]+", message = "Please provide a valid email address")
	@Email(message = "Please provide a valid email address")
	private String email;

}
