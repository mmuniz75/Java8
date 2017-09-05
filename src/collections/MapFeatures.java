package collections;

import java.util.HashMap;

public class MapFeatures {

	public static void main(String args[]){
		
		HashMap<String,String> mapCars = new HashMap();
		mapCars.put("pref", "S-Cross");
		mapCars.put("asxsub", "Renegate");
		mapCars.put("test", "Kicks");
		mapCars.put("equiq", "Ecosport");
		mapCars.put("sem", "Golf");
		
		mapCars.forEach((key,value) -> System.out.println("key=" + key + ", car="+ value));
		
		System.out.println(mapCars.getOrDefault("atual", "ASX"));
		
		mapCars.putIfAbsent("pref", "Crossteck");
		System.out.println(mapCars.get("pref"));
		
		mapCars.replace("x", "Tcross");
		System.out.println(mapCars.get("x"));
		
		mapCars.replace("sem", "Passat", "Polo");
		System.out.println(mapCars.get("sem"));
		
		mapCars.replace("sem", "Golf", "Polo");
		System.out.println(mapCars.get("sem"));
		
		mapCars.remove("sem","Golf");
		System.out.println(mapCars.get("sem"));
		
		
		mapCars.compute("sem", (key,value) -> value + "(not SUV)");
		System.out.println(mapCars.get("sem"));
		
		mapCars.merge("sem", "Variant",(key,value) -> value + "(station)");
		System.out.println(mapCars.get("sem"));
		
		mapCars.merge("novo", "Passat",(key,value) -> value + "(sedan)");
		System.out.println(mapCars.get("novo"));
			
		
		mapCars.replaceAll( (key,value)-> value.toUpperCase());
		mapCars.forEach((key,value) -> System.out.println("key=" + key + ", car="+ value));
		
		
	}
}
