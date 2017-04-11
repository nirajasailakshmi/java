package banktransactions;
import java.util.Scanner;
public class Bankex {
	
	public int number;

		public int wdamount;
		public int balance;
	    public int pinnumber;
		
		int depositamt;
		
		Scanner sin =new Scanner(System.in);
	

		public void display()
		{
	
		
		 
		 System.out.println("enter the balance amount");
		 balance=sin.nextInt();
	
		 System.out.println("what you want to do:");
		 System.out.println("1.withdraw");
		 System.out.println("2.Deposit");
		 System.out.println("enter number 1 or 2");
		 number=sin.nextInt();
		 if(number==1)
		 {
			 System.out.println("withdraw");
		 }
		 else
		 {
			 System.out.println("deposit");
		 }
		}
		 
		 
		 
		
		 public void withdraw() throws  Exception
		 
		 {
			 
				 System.out.println("enter pinnumber in four digit");
				 try
				 {
				 pinnumber=sin.nextInt();
				 
				 
	             check(pinnumber);
		 
				 }
				 
				 
				  catch(Exception e )
				 {
					 System.out.println("check whether the pinnumber given is right");
				 }
				 System.out.println("enter withdrawal amount ");
				 wdamount=sin.nextInt();
				 	 
				 if(wdamount>balance)
				 {
					 throw new Exception("Insufficient fund");
				 }
				 else
				 {
					 System.out.println("withdraw the amount");
				 }
			 }
			 
		 	 
			 
			 public void deposit()
			 {
				 System.out.println("enter pinnumber in four digit");
				 try{
				 pinnumber=sin.nextInt();
				 
				 
	              check(pinnumber);
				 }
				 
				  catch(Exception e )
				 {
					 System.out.println("check whether the pinnumber given is right");
				 }
				 
				 System.out.println("enter the deposit amount");
				 depositamt=sin.nextInt();
				 
			 }
			 
		
			public void check(int pin)
			{
				if(pin==1234)
				{
					System.out.println("pinnumber is valid");
				}
				else
				{
					System.out.println("pinnumber is invalid");
				}
			}
		 public void pandetails(String pandetails)
		 {
			 if(pandetails=="AXZ328909")
			 {
				 System.out.println("Valid pandetails");
			 }
			 else
			 {
				 System.out.println("Invalid");
			 }
			
			 try{
		 
			  if (depositamt>200000)
			 {
				 
				  System.out.println("enter pandetails");
					 pandetails =sin.next();
					 System.out.println("valid transaction with pandetails");
					 

			 }
			  
			 }
			  catch(Exception e)

			  {
				 System.out.println("Deposit the amount with valid pandetails"); 
			  }
			 
		 }
		 
		 
			 
		public static void main(String[] args) throws Exception 
		 {
			 Bankex b= new Bankex();
			 b.display();
			 b.withdraw();
			 b.deposit();
			
			 
			 
		 }
	
		 
	}
			 
			 
			
			 
			 
			 
			 
		 


