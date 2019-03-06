package lambda.main;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lambda.service.PersonOJ;

public class Lambda8 {

	public static void main(String[] args) {
		/*
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {				
				return t.length() > 0;
			}
		};
		*/
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("foo"));
		System.out.println(predicate.negate().test("foo"));
		
		Predicate<Boolean> notNull = Objects ::nonNull;
		Predicate<Boolean> isNull = Objects :: isNull;
		
		Predicate<String> isEmpty = String :: isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		Function<String, Integer> toInteger = Integer::valueOf;
		
		/*
		Function<String, String> backToString = toInteger.andThen(new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {				
				return String.valueOf(t);
			}			
		});
		*/
		Function<String, String> backToString = toInteger.andThen(String::valueOf);		
		System.out.println(backToString.apply("123"));	
		
		
		/*
		Supplier<PersonOJ> personSupplier = new Supplier<PersonOJ>() {
			@Override
			public PersonOJ get() {
				return new PersonOJ();
			}
		};
		*/
		Supplier<PersonOJ> personSupplier = PersonOJ::new;
		System.out.println(personSupplier.get());
		
		
		
		/*
		Consumer<PersonOJ> greeter = new Consumer<PersonOJ>() {
			@Override
			public void accept(PersonOJ t) {
				System.out.println("Hello, " + t.getLastName());
			}			
		};
		*/		
		Consumer<PersonOJ> greeter = (t) 
				-> System.out.println("Hello, " + t.getLastName());
		
		greeter.accept(new PersonOJ("Park", "JongHoon"));
		
		
		PersonOJ person1 = personSupplier.get();
		person1.setFirstName("Park");
		person1.setLastName("JongHoon");
		PersonOJ person2 = personSupplier.get();
		person2.setFirstName("Lee");
		person2.setLastName("JiEun");
		Comparator<PersonOJ> comparator = (p1, p2) -> 
			p1.getFirstName().compareTo(p2.getFirstName());
		System.out.println(comparator.compare(person1, person2));
		System.out.println(comparator.reversed().compare(person1, person2));
	}
	

}
