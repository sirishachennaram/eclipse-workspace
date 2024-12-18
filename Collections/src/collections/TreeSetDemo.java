package collections;


import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo {
	

	public static void main(String[] args) {
		TreeSet<Integer> hs= new TreeSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		System.out.println(hs);
		
		hs.add(100);
		hs.add(200);
		System.out.println(hs);
		
		
		//TreeSet<String> ts= new Treeset<>();
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
           ts.add("java");
           ts.add("python");
           System.out.println(ts);
         //Traversal
           for(String course:ts) {
           System.out.println(course);
	}
	for(int price : hs) {
		System.out.println(price);
	}
           
           
           
           
           
           
           
           
           
           
		

	}

}
