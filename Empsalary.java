package name;
import java.io.*;


public class Empsalary {
	
	public void acceptsalary()
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		try
		{
					
			
	    int salary;
		int loanamount;
		System.out.println("enter the salary");
		salary=Integer.parseInt(br.readLine());
		System.out.println("enter the loan amount");
		loanamount=Integer.parseInt(br.readLine());
		if(salary<0)
		{
			throw new Exception("not eligible for loan");
		}
		else if(salary>10000)
		{
			throw new Exception("not eligible for loan of 100000");
		}
		else if(salary>50000)
		{
			throw new Exception("not eligible for loan of 500000");
		}
		else 
		{
			throw new Exception("not eligible for loan of 1000000");
		}
		}
		
			catch(Exception ex)
			{
				System.out.println("exception occured"+ex.getMessage());
			}
	}
			
		public static void main(String[] args){
			Empsalary e=new Empsalary();
			e.acceptsalary();
		}
	}	
			
			
		
		
	

