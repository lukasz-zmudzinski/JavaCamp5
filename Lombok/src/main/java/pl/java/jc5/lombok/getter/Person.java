package pl.java.jc5.lombok.getter;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Getter @Setter private String firstName;
	@Getter @Setter(AccessLevel.PROTECTED) private boolean employed = true;
	
}
