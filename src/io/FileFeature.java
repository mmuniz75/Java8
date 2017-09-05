package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileFeature {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:","work","workspace","Java8","src","io","test_data.txt"); 
		try{
			Stream<String> stream = Files.lines(path);
			stream.filter(line -> line.contains("LA"))
						  .forEach(System.out::println);
			
		}catch(IOException io){
			io.printStackTrace();
		}
		
	}

}
