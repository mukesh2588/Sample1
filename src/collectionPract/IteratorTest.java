package collectionPract;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> arrrList=new ArrayList<String>();
		arrrList.add("Mukesh");
		arrrList.add("Khedkar");
		arrrList.add("Test1");

		//Get in Iterator
		Iterator<String> itr=arrrList.iterator();

		//print first item

		System.out.println(itr.next());

		//printing all elements

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}



	}

}
