package arrayex1;
import java.util.Scanner;

public class Ascending {
	 private int min;
	int [] numbers;




public  void accept(){

 numbers=new int[10];
Scanner sin=new Scanner(System.in);
for(int i=0;i<10;i++)
{
	
System.out.println("enter the numbers");
numbers[i]=sin.nextInt();
}
min=numbers[0];
for(int i=0;i<10;i++)
{
for(int j=i+1;j<10;j++)
{
	
if(numbers[i]>numbers[j])
{
min=numbers[i];
numbers[i]=numbers[j];
numbers[j]=min;
}
}
}
}

public  void display()
{
	for(int i=0;i<10;i++)
	{
System.out.println("ascending order is " +numbers[i]);
}
}
public static void main(String[] args)
{
Ascending as =new Ascending();
        as.accept();
        as.display();
}

}


