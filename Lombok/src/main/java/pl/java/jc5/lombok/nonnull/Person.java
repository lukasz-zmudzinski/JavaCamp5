package pl.java.jc5.lombok.nonnull;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class Person {
	
	@NonNull @Getter @Setter 
	private String firstName;

}
