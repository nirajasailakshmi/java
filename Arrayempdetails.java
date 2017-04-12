package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayempdetails {
	
	int[] array=new int[5];
	private static String temp1;
	
	
	public static void main(String[] aa)
	{
		
		ArrayList<employee> empdetails=new ArrayList<employee>();
		employee e1=new employee(100,"shiva",23,20000);
	   employee e2=new employee(101,"shanthi",20,30000);
	   employee e3=new employee(102,"sara",25,25000);
	   employee e4=new employee(103,"sam",27,27000);
	   employee e5=new employee(104,"sowmya",33,35000);
	
	
	   empdetails.add(e1);
	   empdetails.add(e2);
	   empdetails.add(e3);
	   empdetails.add(e4);
	   empdetails.add(e5);
	   int temp = 0;
	   temp1 = null;
	   for(employee e:empdetails)
	   {
		   if(e.empsalary>temp)
		   {
			   temp = e.empsalary;
			   temp1 = e.empname;
		   }
		   
	   }
	   System.out.println("Employee with the highest pay is "+temp1);
	   Collections.sort(empdetails);
	   
	   for(employee e:empdetails)
			
	   	{
		System.out.println("----------------------------");
		System.out.println("id is"+e.empid);
		System.out.println("name is"+e.empname);
		System.out.println("age is"+e.empage);
		System.out.println("salary is"+e.empsalary);
		System.out.println("----------------------------");
		}
	
	   
	}
	
	
}	
	class employee implements Comparable <employee>
	{
		int empid,empage,empsalary;
		String empname;
		public employee(int id ,String name,int age ,int salary)
		{
			this.empid=id;
			this.empname=name;
			this.empage=age;
			this.empsalary=salary;
			
		}
		
		public int compareTo(employee e)
		{
			if(empsalary>e.empsalary)
			{
				return 1;
			}
			else if(empsalary<e.empsalary)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		
	}   
	} 
