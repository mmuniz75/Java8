package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirFeature {

	public static void main(String[] args) {
		Path path = Paths.get("c:", "windows");
		
		try{
			Stream<Path> stream = Files.list(path);
			stream.filter(p -> p.toFile().isDirectory())
			.forEach(System.out::println);
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}
