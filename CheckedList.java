package generics;
import java.util.LinkedList;
import java.util.List;

public class CheckedList {
	public static void main(String[]aa)
	{
		LinkedList<String> mydata=new LinkedList<String>();
		mydata.add("first");
		mydata.add("second");
		mydata.add("third");
		mydata.add("fourth");
		mydata.add("fifth");
		mydata.add("random");
		List<String>listdata=new LinkedList<String>();
		listdata.add("second");
		listdata.add("random");
		
		System.out.println("does linked list contains all the list elements ?:"+mydata.containsAll(listdata));
		listdata.add("one");
		System.out.println("does linked list contains all the list elements ?:"+mydata.containsAll(listdata));
	}

		
		

		
		
	}


