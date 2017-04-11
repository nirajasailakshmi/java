package matrix;

import java.util.Scanner;

public class Multiply 
{
              private static Scanner sin;

			public static void main(String args[])
	   {
	      int m, n, i, j, m2, n2, k;
	 
	      sin = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = sin.nextInt();
	      n = sin.nextInt();
	 
	      int a[][] = new int[m][n];
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for ( i = 0 ; i< m ; i++ )
	         for ( j= 0 ; j < n ; j++ )
	            a[i][j] = sin.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      m2=sin.nextInt();
	      n2= sin.nextInt();
	 
	      if ( n != m2 )
	         System.out.println("Matrices with entered orders can't be multiplied with each other.");
	      else
	      {
	         int b[][] = new int[m2][n2];
	         int multiply[][] = new int[m][n2];
	 
	         System.out.println("Enter the elements of second matrix");
	 
	         for ( i= 0 ; i< m ; i++ )
	            for ( j = 0 ; j < n ; j++ )
	               b[i][j] = sin.nextInt();
	 
	         for ( i= 0 ; i< m ; i++ )
	         {
	            for ( j= 0 ; j < m2 ; j++ )
	            {   
	               for ( k = 0 ; k < n2 ; k++ )
	               {
	                  multiply[i][j] = multiply[i][j] + a[i][k]*b[k][j];
	               }	
		 }
	        }
	          
	        {
	         System.out.println("Product of entered matrices:-");
	 
	         for ( i = 0 ; i < m ; i++ )
	         {
	            for ( j = 0 ; j < n ; j++ )
	              {
			 System.out.print(multiply[i][j]+"\t");
		      } 
	            System.out.print("\n");
	         }
	        
	         
	        	 
	         }
	         }
	      }
	   }