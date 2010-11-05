package pl.java.jc5.lombok.data.staticconstr;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@EqualsAndHashCode
public class Person {
	
	private String firstName;
	private @NonNull String lastName;

}
