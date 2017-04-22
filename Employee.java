package filestream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable
{
	
		 String empname,empadd,empphoneno;
		 int empage;
		private List<Employee> empDetails;
		
		public String getempname()
		{
			return empname;
		}
		
		public void setempname(String empname)
		{
			this.empname = empname;
		}
		public String getempadd()
		{
			return empadd;
		}
		
		public void setempadd(String empadd)
		{
			this.empadd = empadd;
		}
		public String getempphoneno()
		{
			return empphoneno;
		}
		
		public void setempphoneno(String empphoneno)
		{
			this.empphoneno = empphoneno;
		}
		public int getempage()
		{
			return empage;
		}
		
		public void setempage(int empage)
		{
			this.empage = empage;
			
			
		}
		
		public List<Employee> empDetails()
		{
			return empDetails();
		}
		
		public void setempDetails(List<Employee> l)
		{
			this.empDetails = l;
		}
	
		
		public static void main(String[]aa)
		{
			try
			{
				FileOutputStream fobj=new FileOutputStream("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\objfile.txt");
				ObjectOutputStream Oobj=new ObjectOutputStream(fobj);
				
				Employee eobj1=new Employee();
				eobj1.setempname("john");
				eobj1.setempadd ("westmambalam");
				eobj1.setempphoneno("3878347091");
				eobj1.setempage(23);
				
				Employee eobj2=new Employee();
				eobj2.setempname("keerthana");
				eobj2.setempadd ("kodambakkam");
				eobj2.setempphoneno("3687637391");
				eobj2.setempage(25);
				
				List<Employee>l=new ArrayList<Employee>();
				l.add(eobj1);
				l.add(eobj2);
				
				Oobj.writeObject("empname");
				Oobj.writeObject("empage");
				Oobj.writeObject("empadd");
				Oobj.writeObject("empphoneno");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
}
				
				
				
				
				
				
			
		
	
		
	
	


		
