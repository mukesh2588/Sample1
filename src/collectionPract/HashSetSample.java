package collectionPract;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Mukesh");
		hs.add("Aniket");
		hs.add("Test1");
		hs.add("Test2");
		hs.add("Test1");
		
		
		for (String string : hs) 
		{
			System.out.println(string);
		}
		

	}

}
