package collectionPract;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("10");
		arr.add("Ten");
		arr.add("Test");
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		arr.set(2, "TestChange");
		System.out.println(arr);
		System.out.println("=====AfterItemRemoved====");
		arr.remove(1);
		System.out.println(arr);
		
		arr.add("NewElement1");
		arr.add("NewElement2");
		arr.add("NewElement3");
		
		System.out.println("++++++++Looping through Array list+++++");
		
		for (int i = 0; i < arr.size(); i++) 
		{
			System.out.println(arr.get(i));
		}
		
	
		
		
		

	}

}
