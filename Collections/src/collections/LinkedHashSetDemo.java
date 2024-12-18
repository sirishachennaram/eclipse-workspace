package collections;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs= new LinkedHashSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		System.out.println(hs);
		
		hs.add(100);
		hs.add(200);
		System.out.println(hs);
		

	}

}
