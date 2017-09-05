package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EachFeature {
	
	
	public static void main(String[] args) {
		List<String> persons = Arrays.asList(new String[]{"Marcelo","Rafael","Carol","Fabiola"});
		List<String> result = new ArrayList<>();
		
		Stream<String> stream = persons.stream();
		
		//stream.forEach(p -> System.out.println(p));
		
		Consumer<String> c1 = result::add;
		Consumer<String> c2 = System.out::println;
		
		System.out.println("Consumer .....");
		
		stream.forEach(c1.andThen(c2));
		
		System.out.println("new list.....");
		
		result.stream().forEach(System.out::println);
		
		System.out.println("filter .....");
		
		Stream<String> stream2 = persons.stream();
		
		stream2.filter(p -> p.indexOf("ar") > -1)
		       .forEach(System.out::println);
		
		Predicate<String> p = Predicate.isEqual("two");
		
		Stream<String> stream3 = Stream.of("one","two","three");
		stream3.filter(p).forEach(System.out::println);

	}

}
