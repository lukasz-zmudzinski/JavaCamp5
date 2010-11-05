package pl.java.jc5.lombok.equalshashcode;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data(staticConstructor="newInstance")
public class Person {
	
	private String firstName;
	private @NonNull String lastName;

}
