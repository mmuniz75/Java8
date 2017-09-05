package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorFeature {
	
	
	class Car{
		String model;
		String cat;
		public String getModel() {
			return model;
		}
		public Car(String model, String cat) {
			super();
			this.model = model;
			this.cat = cat;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
	}
	
	public static void main(String[] args) {
		new CollectorFeature().exec();
	}
	
	
	public void exec(){
		
		List<Car> cars = new ArrayList<>(Arrays.asList(new Car[]{new Car("Renegate","suv"),
																 new Car("ASX","suv"),
																 new Car("S-cross","suv"),
																 new Car("Crossteck","suv"),
																 new Car("Golf","hatch"),
																 new Car("Cruze","hatch"),
																 new Car("Passat","sedan"),
		}));
		
		Map<String,List<Car>> mapCars = cars.stream().collect(Collectors.groupingBy(Car::getCat));
		
		System.out.println(mapCars);
		
		
		Map<String,Long> countCats = cars.stream().collect(Collectors.groupingBy(Car::getCat,Collectors.counting())); 
		
		System.out.println(countCats);
		
		
	}

}
