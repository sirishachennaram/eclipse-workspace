package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamPipeLineDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(5000,4000,2000,3000,6000);
		System.out.println(salaries);
		
		/*
		 1.Filter the salaries which are >=50000
		 2.Increment the filtered salaries by 10%//55000+66000
		 3.Find the total filtered and incremented salaries total//1,11,000
		 Expected output:
		 */
		
		double totalSalary = salaries.stream()//source
				  .filter((salary)->salary>=5000)//intermediate1
				  .map((salary)->salary + salary*.1)//intermediate2
				  .mapToDouble(salary -> salary)//intermediate3
				  .sum();//terminal operation
				  System.out.println(totalSalary);//result
				  /*
					 1.Filter the salaries which are <=50000
					 2.Increment the filtered salaries by 20%
					 3.sort the incremented salaries in descending
					 Expected output:
					 */	 
				  
        List<Integer>IncrementedSalaries = salaries.stream()
				  .filter((salary)->salary<=5000)
				  .sorted(Comparator.reverseOrder())
                  .toList();
                   System.out.println(IncrementedSalaries);
                   
                   /* input:[1,3,2,4,3,1,2]
                    * output:[4,3,2,1]
                    */
                   List<Integer> nums= Arrays.asList(1,3,2,4,3,1,2);
                   List<Integer>uniqueNums =nums.stream()
                		   .distinct()
                		   .sorted(Comparator.reverseOrder())
                           .toList();
                   System.out.println(uniqueNums);
                   
                   
          /* input:JAVA
           *output: J A V A
           */
                   
         character<String> indivdual =String.asCharacter("JAVA"); 
                           .mapToObj(c -> (String) c + " ")
                           .forEach(System.out::print);
                           
                           
                            /*Task 5
                             * input: ["ja va","py thon", "an gu lar"]
                             * output:["JAVA","PYTHON","ANGULAR"]
                             */
                                 
                
	
		}
	
}




                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
				  
				  
	

			
