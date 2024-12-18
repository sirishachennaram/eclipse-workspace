package collections;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("Java");
		s.push("python");
		s.push("Js");
		s.push("Angular");
		s.push("React");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		
		
		

	}

}
