package collections;
import java.util.ArrayDeque;
public class ArrayDequeDemo {

	public static void main(String[] args) {
	ArrayDeque<Integer> d= new ArrayDeque<>();
	d.offerFirst(100);
	d.offerFirst(200);
	d.offerFirst(300);
	
	System.out.println(d);
	
	d.offerLast(100);
	d.offerLast(200);
	d.offerLast(300);
	
	System.out.println(d);
	
	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());
	
	
	System.out.println(d.pollFirst());
	System.out.println(d.pollLast());
	System.out.println(d);
	
	
	

	}

}
