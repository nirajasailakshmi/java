package arrayex1;
import java.util.Scanner;


public class Sumaverage {
	
	

	

	
			int[] numbers;
			int total=0;
			int average=0;
			public void accept()
			{
					numbers = new int[10];
					Scanner sin=new Scanner(System.in);
					
							
					for(int i = 0 ; i <= 9 ; i++)
					{
						System.out.println("Enter the set of numbers");
						
					    numbers[i]= sin.nextInt();
					}
			}
			
			
			public void total ()
			{
				for(int i = 0; i<10 ; i++)
				{
					total = total + numbers[i];	
				}
				average = total/10;
			}
			

			
			public void display()
			{
				System.out.println("The total of the set of numbers is  "+total);
				System.out.println("The average of the set of numbers is  "+average);
			}

	public static void main(String[] args) 
		{
			Sumaverage sobj = new Sumaverage();
			sobj.accept();
			sobj.total();
			sobj.display();
		}
	}




