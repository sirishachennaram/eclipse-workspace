package collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> hm= new TreeMap<>();
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


