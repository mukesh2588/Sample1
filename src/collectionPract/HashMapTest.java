package collectionPract;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		
		hm.put("Mukesh", 123);
		hm.put("Khedkar", 456);
		hm.put("Test", 789);
		
		System.out.println(hm.keySet());
		System.out.println(hm.get("Test"));
		System.out.println(Arrays.asList(hm));
		System.out.println(hm);
		
		hm.forEach((key, value) -> System.out.println(key + " : " + value));
		 

	}

}
