package name;

import java.util.Scanner;

public class Maxsalary {
	
	

		String[][] database = new String[2][5];
		int[] array = new int[5];
		public int temp1 = 0;
		public int temp2 = 0;
		public int highestsalary = 0;
		public int lowestsalary = 0;
		public int sum=0;
		public int avg=0;
		
		
		
		public void acceptempName()
		{
				Scanner input;
				System.out.println("Enter the names of the employees");	
				for(int i = 0 ; i <= 4; i++)
				{
					input = new Scanner(System.in);
				    database[0][i]= input.next();
				}
		}
		public void acceptempsalary()
		{
				Scanner input;
				System.out.println("Enter the salary of employees in the same order as the names you entered");	
				for(int i = 0 ; i <= 4; i++)
				{
					input = new Scanner(System.in);
					database[1][i]= input.next();
					array[i] = Integer.parseInt(database[1][i]);
				}
		}
		public void highestsalary()
		{	
			for(int i = 0; i <= 4 ; i++)
			{
					if(array[i] > highestsalary)
					{  
						 temp1 = i;
						 highestsalary = array [i];
					}
					
			}
		}
		
		public void lowestsalary()
		{	
			for(int i = 0; i <= 4 ; i++)
			{
					if(array[i] > lowestsalary)
					{  
						 temp2 = i;
						 lowestsalary = array [i];
					}
					
			}
		}
		
		public void avg()
		{
			for(int i = 0; i <= 4 ; i++)
			{
				sum=array[i];
				avg=sum/5;
			}
		}
		
		
		
		
		public void topemp()
		{
			System.out.println(database[0][temp1]+" is the highest ");
			System.out.println("His salary was "+database[1][temp1]);
		}
		
		public void lowemp()
		{
			System.out.println(database[0][temp1]+" is the lowest ");
			System.out.println("His salary was "+database[1][temp2]);
		}
		
		
		public static void main(String[] args) 
		{
			Maxsalary mobj = new Maxsalary();
			mobj.acceptempName();
			mobj.acceptempsalary();
			mobj.highestsalary();
			mobj.lowestsalary();
			mobj.avg();
			mobj.topemp();
			mobj.lowemp();
		}
			
			

		

	}



