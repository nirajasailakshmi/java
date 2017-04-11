package arrayex1;
import java.util.Scanner;

public class Calculator {
	
public void revnum()
{
	Scanner sin=new Scanner(System.in);
	int number;
	int rem;
	int rev=0;
	System.out.println("enter the number");
	number=sin.nextInt();
	while(number!=0)
	{
		rem=number%10;
		rev=rev*10+rem;
		number=number/10;
		
	}
	System.out.println("reverse of a number"+rev);
}
public static void main(String args[])
{
	Calculator robj=new Calculator();
	robj.revnum();
	
}

}
