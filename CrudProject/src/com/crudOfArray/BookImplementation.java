package com.crudOfArray;

import java.util.Scanner;

public class BookImplementation implements Bookdetails{
	Scanner sc=new Scanner(System.in);
	Book b[]=new Book[10];
	int id,price;
	String bname,aname;
	int count=0;

	@Override
	public void addBook() {
		System.out.println("Add Book");
		
		System.out.println("Enter number of books you want to add");
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter book id");
			 id=sc.nextInt();
			System.out.println("Enter book name");
			bname=sc.next();
			System.out.println("Enter book price");
			price=sc.nextInt();
			System.out.println("Enter author name");
			aname=sc.next();
			b[count]=new Book(id,bname,price,aname);
			count++;
		}
		System.out.println("Add book Sucessfully");
		
	}

	@Override
	public void UpdateBook() {
		System.out.println("Update Book");
		  System.out.println("Enter the book id you want to Update");
		  int b_id=sc.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(b_id==b[i].getB_id() && b[i]!=null)
		         {
		        	 System.out.println("Enter book name");
		        	 bname=sc.next();
		        	 b[i].setB_name(bname);
		        	 System.out.println("Enter author name");
		        	 aname=sc.next();
		        	 b[i].setAuthor_name(aname);
		        	 System.out.println("Enter book price");
		        	 price=sc.nextInt();
		        	 b[i].setPrice(price);
		         }
			}
		  System.out.println("Book Update Sucessfully");
		
		
	}

	@Override
	public void showBook() {
		for(int i=0;i<count;i++)
		{
			if(b[i]!=null)
			{
			System.out.println(b[i]);
			}
			
		}
		
	}

	@Override
	public void deleteBook() {
	  System.out.println("Delete Book");
	  System.out.println("Enter the book id you want to delete");
	  int b_id=sc.nextInt();
	  for(int i=0;i<count;i++)
		{
	         if(b_id==b[i].getB_id())
	         {
	        	 b[i]=null;
	         }
	         
		}
	  System.out.println("Delete Book Sucessfully");
	  
		
	}

	@Override
	public void searchBook() {
		System.out.println("Search Book");
		  System.out.println("Enter the book id you want to search");
		  int b_id=sc.nextInt();
		  int flag=0;
		  int i;
		  for( i=0;i<count;i++)
			{
		         if(b_id==b[i].getB_id() && b[i]!=null)
		         {
		        	 flag=1;
		        	 break;
		
	              }

              }
		  if(flag==1)
		  {
			  System.out.println("Given book Available");
			  System.out.println(b[i]);
		  }
		  else
			  System.out.println("Given Book not available");
	}
}
