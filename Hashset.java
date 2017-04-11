package generics;


import java.util.HashSet;

public class Hashset {
	public static void main(String[] aa)
	{
		HashSet<String> hobj = new HashSet<String>();
		hobj.add("sunday");
		hobj.add("monday");
		hobj.add("tuesday");
		hobj.add("wednesday");
		hobj.add("thursday");
		hobj.add("friday");
		hobj.add("saturday");
		System.out.println("data display"+hobj);
		System.out.println("size after adding all data"+hobj.size());
		hobj.remove("sunday");
		System.out.println("size after removing sunday"+hobj.size());
		System.out.println("data display after removing sunday"+hobj);
	}
		
		
	

}
