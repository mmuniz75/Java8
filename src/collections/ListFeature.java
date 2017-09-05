package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListFeature {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList<>(Arrays.asList("Renegate","S-Cross","Crossteck"));

		cars.stream().forEach(System.out::println);
		
		System.out.println(cars.stream().collect(Collectors.joining(",")));
		
		cars.replaceAll(c -> c + "(X)");
		
		System.out.println(cars.stream().collect(Collectors.joining(",")));
		
		cars.removeIf(c -> !c.contains("Cross"));
		
		System.out.println(cars.stream().collect(Collectors.joining(",")));
		
		List<String> numbers = new ArrayList<>(Arrays.asList("4","2","8","3","0","1","7"));
		
		numbers.sort(Comparator.naturalOrder());
		
		System.out.println(numbers.stream().collect(Collectors.joining(",")));
		
	}

}
