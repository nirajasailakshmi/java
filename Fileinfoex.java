package filestream;
import java.io.*;

public class Fileinfoex {
	public static void main(String[]aa)
	{
		try
		{
			File fobj=new File("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\empsalary.txt");
			System.out.println("check whether the file can be read");
			System.out.println(fobj.canRead());
			System.out.println("check whether the file can be modified or not");
			System.out.println(fobj.canWrite());
			System.out.println("check whether the file or directory exists");
			System.out.println(fobj.exists());
			System.out.println("check the actual path of file or directory ");
			System.out.println(fobj.getAbsoluteFile());
			System.out.println("check whether file or directory is hidden or not");
			System.out.println(fobj.isHidden());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			
			
		}
	}
	

}
