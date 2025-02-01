package org.tnsif.accenture.c2tc.oops;

class Book
{
	String title;
	int page;
	
	Book()
	{
		title="unknown";
		page=0;
	}
	Book(String title)
	{
		this.title=title;
		page=0;
	}
	Book(String title ,int page)
	{
		this.title=title;
		this.page=page;
	}
	
	void display()
	{
		System.out.println("Title :"+title + " Page :"+page);
	}
}


public class Constructor_Overloading {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book("Java Programming");
		Book book3=new Book("Python" ,12);
		book1.display();
		book2.display();
		book3.display();
	}

}
