package collectionPract;

import java.util.LinkedHashMap;

public class MapOfMap {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<String, String>> outerMap =
				new LinkedHashMap<String, LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> innerMap1=new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> innerMap2=new LinkedHashMap<String, String>();
		
		innerMap1.put("Name", "Mukesh");
		innerMap1.put("Address", "PS");
		innerMap1.put("Age", "33");
		
		innerMap2.put("Name", "Aniket");
		innerMap2.put("Address", "Visharantwadi");
		innerMap2.put("Age", "28");
		
		outerMap.put("1", innerMap1);
		outerMap.put("2", innerMap2);
		
		System.out.println("outerMap --> " + outerMap);
		
		
		

	}

}
