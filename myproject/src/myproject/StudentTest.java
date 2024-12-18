package myproject;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
	List<Student> Students = Arrays.asList(
			new Student(),
			new Student(),
			new Student(),
			new Student()
			);
			
		System.out.println(".......All Student List............");
		Students.forEach(System.out:: println);
		
			
			
			
			

	}

}
