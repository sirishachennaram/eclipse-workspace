package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapMethodDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,44000,25000,35000);
		System.out.println(salaries);
		
		List<Integer> incrementedSalaries = new ArrayList<>();
		//6000,5000,3000,4000
		
		Function <Integer, Integer> fun =( salary)-> salary +5000;
		
		
		incrementedSalaries = salaries.stream()
				                        .map(fun)
				                         .toList();
		
		System.out.println(incrementedSalaries);
		
		//increament each salary by 10%
		List<Double>incrSalaries = salaries.stream()
				                   .map((salary)->salary+salary*.1)
						           .toList();
				System.out.println(incrSalaries);
				
				//Display total existing salary
				List<Double>totalsalaries = salaries.stream()
		                   .map((salary)->salary+salary*.1)
				           .toList();
				           
		System.out.println(totalsalaries);
		
				
				

	}

}
