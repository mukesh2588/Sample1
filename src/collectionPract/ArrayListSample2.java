package collectionPract;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample2 {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Mukesh");
		arr.add("Mukesh22");
		arr.add("Mukesh1");
		arr.add("Mukesh2");
		arr.add("Mukesh3");
		System.out.println("Printing elements using foreach loop");
		
		for (String str : arr) 
		{
			System.out.println(str);
		}
		
		Collections.sort(arr);
		
		System.out.println("========After sorting=======");
		
		for (String string : arr)
		{
			System.out.println(string);
		}

	}

}
