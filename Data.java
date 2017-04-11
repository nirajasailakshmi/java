package matrix;

import java.util.Scanner;



public class Data {
	Scanner Sin=new Scanner(System.in);
	

	 int[][] a=new int[3][3];
	 int[][] b= new int [3][3];
	 int[][] c= new int [3][3];
     int i,j,m,n,m1,n2;
 
	public void accept(){
		
		System.out.println("enter the number of rows and columns of first matrix");
		m=Sin.nextInt();
		n=Sin.nextInt();
		System.out.println("enter the number of rows and columns of second matrix");
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
	
		for(j=0;j<n2;j++)
		
		b[i][j]=Sin.nextInt();
	}
		
	
	public void display(){
		
for(i=0;i<m;i++)

for(j=0;j<n;j++)
	System.out.println("first matrix is"+a[i][j]);


for(i=0;i<m1;i++)
	for(j=0;j<n2;j++)
		System.out.println("second matrix is" +b[i][j]);
	

	}
	public static void main(String args[]){
		Data d=new Data();
		d.accept();
		d.display();
	}

		
	}

	
	
	

