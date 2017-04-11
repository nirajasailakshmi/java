package collections;

import java.util.ArrayList;

public class arraylist{
	public  static void main(String[] aa)
	{
		ArrayList<Book> Bookdetails = new ArrayList<Book>();
		
		
		Book b1=new Book (1,"harrypotter","tata","ronald",2);
		Book b2=new Book(2,"javascript","wrox","tata",3);
		Book b3=new Book(3,"core java","john","tata", 2);
		Book b4=new Book(4,"advanced ","sara","tata",5);
		Book b5=new Book(5,"java","sam","tata",4);
		Book b6=new Book(6,"generics","bill","tata",7);
	
	Bookdetails.add(b1);
	Bookdetails.add(b2);
	Bookdetails.add(b3);
	Bookdetails.add(b4);
	Bookdetails.add(b5);
	Bookdetails.add(b6);
	
	for(Book b:Bookdetails)
	{
		System.out.println("------------------------");
		System.out.println("id is"+b.id);
		System.out.println("Bookname is"+b.bookname);
		System.out.println("Bookauthor is"+b.bookauthor);
		System.out.println("Bookpublisher is"+b.bookpublisher);
		System.out.println("Quantity is"+b.qty);
		System.out.println("------------------------");
	}
	
	Bookdetails.remove(b6);
	for(Book b:Bookdetails)
	{
	System.out.println("------------------------");
	System.out.println("id is"+b.id);
	System.out.println("Bookname is"+b.bookname);
	System.out.println("Bookauthor is"+b.bookauthor);
	System.out.println("Bookpublisher is"+b.bookpublisher);
	System.out.println("Quantity is"+b.qty);
	System.out.println("------------------------");
	}
	}
	public class Book
	{
		int id,qty;
		String bookname,bookauthor,bookpublisher;
		
		public Book(int id,String name,String author,String publisher,int qty)
		{
			this.id=id;
			this.bookname = name;
			this.bookauthor = author;
			this.bookpublisher = publisher;
			this.qty = qty;
		}
	
	}
	}

	
		
	
	
	
	
	
	
		
		
	


