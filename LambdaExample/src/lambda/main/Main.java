package lambda.main;

import lambda.service.Person;
import lambda.service.Say;

public class Main {

	public static void main(String[] args) {
		Person rin = new Person();
		rin.hi((a,b) -> {
				System.out.println("My name is Coding-Factory");
				System.out.println("Nice to meet you");
				System.out.println("parameter number is " +a+", " + b);
				return a+ b;			
		});

	}

}
