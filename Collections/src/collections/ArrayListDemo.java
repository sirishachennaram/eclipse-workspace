package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<>();
		System.out.println(a1.size());
		System.out.println(a1);
		
		a1.add(100);
		a1.add(200);
		System.out.println(a1.size());
		System.out.println( a1);
		
		
		a1.add("Java");
		a1.add("Python");
		System.out.println(a1.size());
		System.out.println(a1);
		
		
		a1.add(2);
		System.out.println(a1.size());
		System.out.println(a1);
		
		
		a1.set(0, 1000);//updating
		System.out.println(a1.size());
		System.out.println(a1);
		
		a1.remove(0);
		System.out.println(a1.size());
		System.out.println(a1);
		
		System.out.println((a1.get(0)));
		//System.out.println(a1.get(5));
		System.out.println(a1.get(a1.size()-1));
		
		a1.clear();//remove all elements
		System.out.println(a1.size());
		System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
