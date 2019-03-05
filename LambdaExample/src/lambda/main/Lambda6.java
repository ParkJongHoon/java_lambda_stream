package lambda.main;

import lambda.service.PersonOJ;

public class Lambda6 {

	@FunctionalInterface
	interface PersonFactory<P extends PersonOJ>{
		P create(String firstName, String lastName);
	}
	public static void main(String[] args) {
		PersonFactory<PersonOJ> personFactory = PersonOJ::new;
		PersonOJ person = personFactory.create("Park", "JongHoon");
		
		System.out.println(person);

	}

}
