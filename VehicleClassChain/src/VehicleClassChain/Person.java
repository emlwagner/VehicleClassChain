package VehicleClassChain;

import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	Person() {
		this.setPersonID(UUID.randomUUID());
	}
	
	Person(String first, String last) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setPersonID(UUID.randomUUID());
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID(UUID personID) {
		PersonID = UUID.randomUUID();
	}

}
