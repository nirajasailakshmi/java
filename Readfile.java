package filestream;
import java.io.*;
public class Readfile {
	
	
	 public static String stdname;
		public static String stdphone;
		  public static  int stdid;
		public static int stdage;
		 public  static float stdfee;
		private static ObjectInputStream oibj;
	

	public static void main(String[]aa)
	{
		try
		{
			oibj = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\menu.txt"));
			
		}
		catch(Exception e)
		{
			
		}
	
		try
		{
			Course cin = new Course();	
			cin = (Course)oibj.readObject();
			Student st=cin.stdDetails().get(0);
			int i=0;
			while(i<4)
				{
				
				System.out.println(st.getstdname(stdname));
				System.out.println(st.getstdage(stdage));
				System.out.println(st.getstdid(stdid));
				System.out.println(st.getstdphone(stdphone));
				System.out.println(st.getstdfee(stdfee));
				i++;
				}
			
			
			
			int temp = st.getstdage(stdage);
			System.out.println(temp);
			
			System.out.println(cin.getCrsName());
			
			if (stdage>18)
			{
			System.out.println(cin.stdDetails());
			}
		
			
			
		
		}
		catch(IOException e)
		{
			System.out.println("Error occurred..");
		}
		catch(ClassNotFoundException ee)
		{
					
		}
		catch(Exception e1)
		{
			System.out.println("Error occurred..");		
		}

}
}
