package pl.java.jc5.lombok.tostring;

import lombok.ToString;


@ToString(callSuper=true, exclude="producer")
public class Car extends Vehicle {
	
	private String producer;

}
