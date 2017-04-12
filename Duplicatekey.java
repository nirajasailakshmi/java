package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public class Duplicatekey {
	
public static void main(String[]aa)
{
	HashMap<Integer,String> hmap=new HashMap<Integer,String>();
	hmap.put(100, "Banana");
	hmap.put(200, "Mango");
	hmap.put(300, "Orange");
	hmap.put(150, "Grapes");
	System.out.println("adding duplicate key");
   hmap.put(100, "Banana");
   System.out.println("After adding duplicate key");
   for(Map.Entry m:hmap.entrySet())
   {
	   System.out.println(m.getKey()+"--------"+m.getValue());
   }
}

   
   
   
   
	
	
}

