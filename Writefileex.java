package filestream;
import java.io.*;

public class Writefileex {
	public static void main(String[] aa)
	{
		String fname=("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\newfile.txt");
		
		try
		{
			FileWriter fw =new FileWriter(fname);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("it is a first line using java file");
			bw.write("it is a second line using java file");
			bw.write("it is a third line using java file");
			bw.write("it is a fourth line using java file");
			bw.write("it is a fifth line using java file");
			bw.write("it is a sixth line using java file");
			bw.close();
			fw.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}

			
		}
		
		
	
	


