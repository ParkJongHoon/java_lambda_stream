package lambda.main;

import lambda.service.Person;
import lambda.service.Say;

public class Lambda {
	/*
	 *  Lambda 첫번째 예제
	 *  사용하는 클래스 lambda.service.Person, lambda.service.Something
	 *  Person 클래스의 메소드 hi에서 Something 인터페이스를 인자로 사용함
	 *  Something이 구현체가 아니기 때문에 구현해야 하는 내용을
	 *  람다식을 이용하여서 구현
	 *  람다식 이전 인터페이스 구현방법과 람다식 구현방법의 기능은 동일
	 *  표현방식의 간결함의 차이
	 */
	public static void main(String[] args) {
		Person rin = new Person();
		// 람다식 이전 인터페이스 구현방법
		/*
		rin.hi(new Say() {			
			@Override
			public int something(int a, int b) {
				System.out.println("My name is Coding-Factory");
				System.out.println("Nice to meet you");
				System.out.println("parameter number is " +a+", " + b);
				return a+ b;
			}
		});
		*/
		// 람다식 적용 후 인터페이스 구현방법
		rin.hi((a,b) -> {
				System.out.println("My name is Coding-Factory");
				System.out.println("Nice to meet you");
				System.out.println("parameter number is " +a+", " + b);
				return a+ b;			
		});

	}

}
