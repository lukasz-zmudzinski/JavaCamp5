package pl.java.jc5.lombok.data;

import java.util.Date;

import lombok.Data;

@Data
public class Person {
	
	private String firstName;
	private String lastName;
	private Sex sex;
	private final Date birthDate;

}
