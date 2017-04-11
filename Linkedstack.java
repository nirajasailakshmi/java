package generics;

import java.util.LinkedList;

public class Linkedstack {
	public static void main(String[] aa)
	{
		LinkedList<String>mydata=new LinkedList<String>();
		mydata.add("first");
		mydata.add("second");
		mydata.add("third");
		mydata.add("fourth");
		mydata.add("random");
		System.out.println("elements in linkedlist before push");
		System.out.println(mydata);
		mydata.push("push element");
		System.out.println("elements in linkedlist after push");
		System.out.println(mydata);
		mydata.push("push element");
		System.out.println("elements in linkedlist after pop");
		System.out.println(mydata);
		mydata.pop();
	}
	}


