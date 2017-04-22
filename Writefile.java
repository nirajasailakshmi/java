package filestream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Writefile {



	public static void main(String[] args)
	{
		try 
		{
			FileOutputStream fobj = new FileOutputStream("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\menu.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fobj);
			
			Student s1=new Student();
			s1.setstdname("kkkk");
			s1.setstdage(23);
			s1.setstdfee(30000.100f);
			s1.setstdphone("7478393793");
			s1.setstdid(100);
			
			Student s2=new Student();
			s1.setstdname("kishan");
			s1.setstdage(26);
			s1.setstdfee(32000.100f);
			s1.setstdphone("8939020929");
			s1.setstdid(101);
			
			Student s3=new Student();
			s1.setstdname("keerthan");
			s1.setstdage(17);
			s1.setstdfee(31000.100f);
			s1.setstdphone("8330983337");
			s1.setstdid(102);
			
			Student s4=new Student();
			s1.setstdname("keerthana");
			s1.setstdage(15);
			s1.setstdfee(34000.100f);
			s1.setstdphone("8778978990");
			s1.setstdid(103);
			
			Course cobj=new Course();
			cobj.setCrsName("Big data");

			
			List<Student> l=new ArrayList<Student>();
			l.add(s1);
			l.add(s2);
			l.add(s3);
			l.add(s4);
			cobj.setstdDetails(l);
			
		obj.writeObject(cobj);
	
	
		cobj.setstdDetails(l);

		fobj.close();
		obj.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Error occurred..");
	}
}
}

