package collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(55,44,88,99,77,66);
		System.out.println(list);
		
		//collections.sort(list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		
		int[] arr = {55,44,99,66,77,33};
		System.out.println(arr);//displays address of the arrays
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 44));
		
		

	}

}
