package lambda.main;

public class Lambda3 {
	@FunctionalInterface
	public interface MyNumber{
		int getMax(int num1, int num2);
	}
	public static void main(String[] args) {
		MyNumber max = (int a, int b) -> (a>=b)? a:b;
		System.out.println(max.getMax(10, 20));
	}

}
