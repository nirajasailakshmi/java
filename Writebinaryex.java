package filestream;
import java.io.*;

public class Writebinaryex {
	public static void main(String[] aa)
	{
		String data=("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\binarydata.txt");
		String bytedata="This is the example of Binary data";

		byte[] buffer=bytedata.getBytes();
		
		try
		{
			FileOutputStream fout=new FileOutputStream(data);
			fout.write(buffer);
			fout.close();
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
			
		} 
		finally
		{
			System.out.println("completed writing data to file from finally:");
		}
	}
}
	
			
		
		
		
	


