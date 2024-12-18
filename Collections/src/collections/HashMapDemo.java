package collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm= new LinkedHashMap<>();
		hm.put("JFS",400 );
		hm.put("PFS",400);
		hm.put("Mean",250);
		hm.put("MERN",200);
		System.out.println(hm);
		
		
		hm.put("jFS", 500);
		System.out.println(hm);
		
		hm.put(null,100);
		System.out.println(hm);
		
		hm.put("Java", null);
		System.out.println(hm);
		
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String, Integer>entry:hm.entrySet()) {
			System.out.println(entry);
		}

	}

}
