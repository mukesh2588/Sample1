package loops;

import java.util.ArrayList;

public class ForEachTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		
		arrList.add("Mukesh");
		arrList.add("Test");
		arrList.add("Khedkar");
		
		System.out.println(arrList.contains("Mukesh"));
		
		System.out.println("");
		
		for(String str:arrList)
		{
			System.out.println(str);
		}

	}

}
