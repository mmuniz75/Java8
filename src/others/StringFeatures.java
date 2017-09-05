package others;

import java.util.StringJoiner;

public class StringFeatures {

	public static void main(String[] args) {
		String hello = "Hello World";
		
		
		StringJoiner sj = new StringJoiner(",","[","]");
		sj.add("Marcelo").add("Carolina").add("Rafael").add("Fabiola").add("Evani").add("Katia").add("Arnobio");
		
		System.out.println(sj);
		
		hello.chars().mapToObj(c->Character.toUpperCase((char)c)).forEach(System.out::print);
		System.out.println("");
		hello.chars().forEach(c -> System.out.print(Character.toUpperCase((char)c)));
		
	}

}
