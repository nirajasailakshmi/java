package filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	public  int cid,cage,csalary;
	public String cname,ccity;
	
	public String getcname()
	{
		return cname;
		
	}
	public void setcname(String cname)
	{
		this.cname=cname;
	}

	public String getccity()
	{
		return ccity;
		
	}
	public void setccity(String ccity)
	{
		this.ccity=ccity;
	}
	

	public int getcid()
	{
		return cid;
		
	}
	public void setcdid(int cid)
	{
		this.cid=cid;
	}
	public int cage()
	{
		return cage;
		
	}
	public void setcage(int cage)
	{
		this.cage=cage;
	}
	public int getcsalary()
	{
		return csalary;
		
	}
	public void setcsalary(int csalary)
	{
		this.csalary=csalary;
	}
			
public static void main(String[]aa) throws Exception
{
	  int cid,cage,csalary = 0;
	 String cname,ccity;
	 
	 try{
	 
	  Customer c1=new Customer();
	 	c1.setccity("chennai");
	 	c1.setcdid(123);
	 	c1.setcname("neeraja");
	 	c1.setcsalary(1234567);
	 	c1.setcage(21);
	 
		Customer c2=new Customer();
		c2.setccity("kerala");
		c2.setcdid(124);
		c2.setcname("keerthana");
		c2.setcsalary(130000);
		c2.setcage(25);
		
		Customer c3=new Customer();
		c3.setccity("ooty");
		c3.setcdid(125);
	    c3.setcname("kushboo");
		c3.setcsalary(80000);
		c3.setcage(31);
		
		
	 File f1=new File("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\customer.txt");
        
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		
		 fw.write(c1.getcid());
		 fw.write(c1.getcname());
		 fw.write(c1.getccity());
		 fw.write(c1.getcsalary());
		 fw.write(c1.cage());
		 
	 fw.write(c2.getcid());
	 fw.write(c2.getcname());
	 fw.write(c2.getccity());
	 fw.write(c2.getcsalary());
	 fw.write(c2.cage());
	 
	 fw.write(c3.getcid());
	 fw.write(c3.getcname());
	 fw.write(c3.getccity());
	 fw.write(c3.getcsalary());
	 fw.write(c3.cage());
	 try{
		 
	 if(csalary>100000)
	 {
	 
FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\New folder\\java pgm files\\customer.txt");
BufferedReader br=new BufferedReader(fr);

	 }
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
	fw.close();
	
	

	
	 
	 }
	 catch(Exception ee)
	 {
		 System.out.println(ee.getMessage());
	 }
	 
	 }
}


