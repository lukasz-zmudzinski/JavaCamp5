package pl.java.jc5.lombok;

import java.util.Date;

import pl.java.jc5.lombok.data.Person;

public class LombokDebugTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person(new Date());
		System.out.println(p.getFirstName());
	}

}
