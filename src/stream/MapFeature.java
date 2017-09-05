package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFeature {
	
	class Person{
		private int age;
		private String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
	}
	
	
	public static void main(String[] args) {
		BinaryOperator<Integer> sum = (n1,n2) -> n1+n2;
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		int red = stream.reduce(0, sum);
		System.out.println(red);
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		Optional<Integer> max = stream2.max(Comparator.naturalOrder());
		System.out.println(max.get());
		
		new MapFeature().exec();
	}
	
	public void exec() {

		List<Person> persons = Arrays.asList(new Person[]{new Person(42,"Marcelo"),new Person(9,"Rafael"),new Person(40,"Carol"),new Person(43,"Fabiola")});
		
		Stream<Person> stream = persons.stream();

		stream.map(p -> p.getName()).forEach(System.out::println);;
		
		System.out.println(persons.stream().map(p -> p.getAge()).reduce(0,(i1,i2) -> i1+i2));
		
		System.out.println(persons.stream().map(Person::getName).filter(name -> name.indexOf("ar") > -1).collect(Collectors.joining(",")));
		
		
		
	
	}

}
