package java8features;
import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachMethodDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(44,55,66,77,88,99);
		System.out.println("using for each loop");
		for(int x : list) {
			System.out.println(x);
		}
		
		for(int element : list) {
			if (element % 2 == 0) {
	            System.out.println(element);
	        }
		}

    // Use forEach() method
    list.forEach((element) -> {
    	if (element % 2 == 0) {
            System.out.println(element);
        }
    });
    System.out.println("using filter() method");
    
    Predicate<Integer> predicate = (element) -> element%2 ==0;
    
    list.stream()
     	.filter(predicate)
    	.forEach(System.out :: println);
    
    System.out.println("using filter() method using Stream API");
    list.stream()
 	.filter((element) -> element%2 ==0)//predicate as argument and expression should be boolean. based on the return type we need to write the condition
	.forEach(System.out :: println);
    

   
    
    

}
}

  



