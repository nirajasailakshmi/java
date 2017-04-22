package filestream;
import java.io.*;

public class Readfileex {
	public static void main(String[]aa)
	{
		int i;
		char c;
		try
		{
			FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\empsalary.txt");
			while((i=f.read())!=-1)
			{
				c=(char) (i);
				System.out.println(c);
			}
		
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		}


