package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BufferFeature {
	
	public static void main(String[] args) {
		try{
			Path path = Paths.get("C:","work","workspace","Java8","src","others","phrases2.txt");
			BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
			Stream<String> stream = reader.lines();
			stream.forEach(c -> setMap(c));
			
		}catch(IOException io){
			io.printStackTrace();
		}
		System.out.println(storePhrases);
		
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File("C:/work/workspace/Java8/src/others/phrases2.txt")));
			Stream<String> stream = reader.lines();
			stream.forEach(System.out::println);
			
		}catch(IOException io){
			io.printStackTrace();
		}
	}
	
	
	private static HashMap<String,Integer> storePhrases = new HashMap<>();
	
	private static void setMap(String row){
		
		StringTokenizer token = new StringTokenizer(row,"|");
		while(token.hasMoreTokens()){
			String phrase = token.nextToken().trim();
			
			// Store the phrase in a Hash keep counting the number same phrase repeat
			if(storePhrases.containsKey(phrase))
				storePhrases.put(phrase,storePhrases.get(phrase)+1);
			else
				storePhrases.put(phrase,1);
		}
	}
	
}
