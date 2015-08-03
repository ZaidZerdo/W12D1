package main;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ExampleWrite {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Amina", "Fakultet prava", 6);
				
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File("C:/Users/Zaid/Desktop/Amina.json"), s1);
			System.out.println("It worked!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
