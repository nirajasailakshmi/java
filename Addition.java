import java.util.Scanner;



public class Addition
{
 Scanner Sin = new Scanner(System.in);
public int[][] a=new int[3][3];
public int[][] b=new int[3][3];
public int[][] c=new int[3][3];
public int i,j,m,n,m1,n2;
 public void accept()
 {

 System.out.println("enter number of rows and columns of the first matrix:");

 m=Sin.nextInt();
 n=Sin.nextInt();
 
 System.out.println("enter number of rows and columns of second matrix:");
 m1=Sin.nextInt();
 n2=Sin.nextInt();

System.out.println("enter elements of first matrix");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
 a[i][j]=Sin.nextInt();
}
}

System.out.println("enter elements of second matrix");

for(i=0;i<m1;i++)
{
for(j=0;j<n2;j++)
{

b[i][j]=Sin.nextInt();
}
}


for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
 }
public void display()
{
	System.out.println("addition of 2 matrices");
	for(int i=0 ; i<m ; i++)
		{
			for(int j=0; j<n ; j++)
				{
					System.out.println("addition"+c[i][j]);
				}
		}
}

public static void main(String ar[]){

Addition a=new Addition();
a.accept();
a.display();
}
}
