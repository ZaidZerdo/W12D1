package main;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ExampleRead {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Student s1 = mapper.readValue(new File("C:/Users/Zaid/Desktop/Amina.json"), Student.class);
			System.out.println("It worked!");
		
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getFaculty());
			System.out.println(s1.getSemester());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
