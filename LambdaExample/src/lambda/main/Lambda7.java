package lambda.main;

public class Lambda7 {
	
	static int outerStaticNum;
	int outerNum;
	@FunctionalInterface
	interface Coverter<T, F>{
		F convert(T from);
	}

	public static void main(String[] args) {
		int num =1;
		Coverter<Integer, String> stringConverter =
				(from) -> {
					outerStaticNum = 72;
					return String.valueOf(from + num);
					};
		System.out.println(stringConverter.convert(2));
		System.out.println(outerStaticNum);

	}

}
