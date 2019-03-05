package lambda.main;

import lambda.service.Something;

public class Lambda5 {

	@FunctionalInterface
	interface Converter<F, T>{
		T convert(F from);
	}
	public static void main(String[] args) {
		Something something = new Something();
		Converter<String, String> converter = something::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);
	}

}
