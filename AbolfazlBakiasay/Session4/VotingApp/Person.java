
public class Person {
	private String firstName, lastName;
	
	public Person(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Person)) return false;
		Person person = (Person) obj;
		return (
			person.getFirstName().equals(firstName) &&
			person.getLastName().equals(lastName)
		);
	}
}
