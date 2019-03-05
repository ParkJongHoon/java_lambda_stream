package lambda.main;

public class Lambda4 {
	@FunctionalInterface
	interface Converter<E, U>{
		U conver(E from);
	}

	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		System.out.println(converter.conver("80"));
	}

}
