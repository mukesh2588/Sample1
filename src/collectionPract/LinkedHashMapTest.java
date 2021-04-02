package collectionPract;


import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm= new LinkedHashMap<String,String>();
		
		
		lhm.put("Mukesh", "Yawal");
		lhm.put("Aniket", "Pune");
		lhm.put("Piyush", "Patana");
		
		System.out.println(lhm);
		
		System.out.println(lhm.keySet());
		
		
		

	}

}
