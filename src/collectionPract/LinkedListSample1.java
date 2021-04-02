package collectionPract;

import java.util.LinkedList;

public class LinkedListSample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(12);
		list.add(10);
		list.add(90);
		
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		
		list.add(27);
		
		System.out.println("========After Adding=====");
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		
		list.addFirst(33);
		
		System.out.println("========After Adding element at beginning=====");
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		
		list.addLast(99);
		
		System.out.println("========After Adding element at End=====");
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		
		
		
		
		

	}

}
