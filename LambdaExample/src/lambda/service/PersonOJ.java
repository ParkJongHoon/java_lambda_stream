package lambda.service;

public class PersonOJ {
	String firstName;
	String lastName;
	
	public PersonOJ() {}
	
	public PersonOJ(String firstName, String lastName){
		this.firstName =  firstName;
		this.lastName =  lastName;
	}

	@Override
	public String toString() {
		return "PersonOJ [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	

}
