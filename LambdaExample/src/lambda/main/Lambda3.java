package lambda.main;

public class Lambda3 {
	/*
	 * 앞서 Lambda.class 예제를 이해 요망
	 * 익명의 인터페이스를 클래스 내부에서 선언 후
	 * 람다식을 이용하여 인터페이스 내부 구현 후 사용하는 예제
	 * 특징 인터페이스 내부의 메소드의 반환타입과 파라미터로 구현
	 *  int getMax(int num1, int num2);
	 *  반환타입 int
	 *  내부 파라미터 int num1, int num2
	 *  
	 *  람다식 형태
	 *  (파라미터 형태) -> (return) 반환타입
	 *  * 파라미터의 데이터형 생략 가능
	 *  * return 은 생략 가능하다
	 *  * return 에 대한 로직이 한줄이면 중괄호 생략가능
	 *  
	 *  람다식 결과
	 *  (int a, int b) -> return (a>=b)? a:b;
	 *  람다식 결과 생략버전
	 *  (a, b) -> (a>=b)? a:b;
	 */
	@FunctionalInterface
	public interface MyNumber{
		int getMax(int num1, int num2);
	}
	public static void main(String[] args) {
		//MyNumber max = (int a, int b) ->{return (a>=b)? a:b;};
		MyNumber max = (a, b) -> (a>=b)? a:b;
		System.out.println(max.getMax(10, 20));
	}

}
