package java8features;

import java.util.Arrays;
import java.util.List;

public class AggregatefunctionDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,44000,25000,35000);
		System.out.println(salaries);
		
		 System.out.println("................");
		  
		  int totalSalary = salaries.stream()//stream resource
				  .mapToInt((salary)->salary)//intermediate operations
				  .sum();
				  System.out.println(totalSalary);//result
				  
	System.out.println("......max salary........");			  
				     int max = salaries.stream()
						  .mapToInt((salary)->salary)
						  .max()
				          .getAsInt();
						  System.out.println(max); 
						  
	System.out.println(".........min salary........");					  
					int min = salaries.stream()
								  .mapToInt((salary)->salary)
								  .min()
						          .getAsInt();
								  System.out.println(min);
								  
	System.out.println("........avg salary...............");							  
								  
					 double avg= salaries.stream()
										  .mapToInt((salary)->salary)
										  .average()
								          .getAsDouble();
										  System.out.println(avg); 
						  
				  
		
	}

}