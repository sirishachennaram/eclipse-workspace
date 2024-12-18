package collections;
import java.util.ArrayList;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add("Java");
		a1.add("Python");
		a1.add(45000.0);
		a1.add(35000.0);
		System.out.println(a1);
		
		Object abj=a1.get(0);
		int x=(int)abj;//type casting
		System.out.println(x);
		
		
		
		//Generic Version ArrayList-Type safety
		ArrayList<Integer>subjectMarks= new ArrayList();
        subjectMarks.add(55);
		subjectMarks.add(44);
		subjectMarks.add(66);
		//subjectMarks.add("Java");
		System.out.println(subjectMarks);
		
		int s1=subjectMarks.get(0);
		System.out.println(s1);//automatically change to that ArrayList
		
		
		
		
		
		
		
		
	}

}
