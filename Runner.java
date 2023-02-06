package arrayListLibraryFinal;
import java.util.Scanner;
import java.util.Collections; 

import arrayListLibraryFinal.Book;

import java.util.ArrayList;

public class Runner 
{
	public static ArrayList<String> titles = new ArrayList<String>(); 
	public static ArrayList<String> subjects = new ArrayList<String>();
	public static ArrayList<Integer> yrs = new ArrayList<Integer>(); 
	
	//create the books arrayList
	public static ArrayList<Book> books = new ArrayList<Book>(); 
	public static Scanner in = new Scanner (System.in); 
	
	public static void main(String[] args) {	
		createArrayLists(); 		
		printOutAllBooks();
		sortByYr(); 
		sortByPgs();
		sortByRating(); 
		System.out.println("Search for a subject to find books of that subject: ");
		findSub(in.nextLine());
		System.out.println("Search for a book title to see if it exists: ");
		findBookTitle(in.nextLine()); 	
		System.out.println("Type a book title to add it to the list: ");
		String ansTitle = in.nextLine();	
		System.out.println("Type a book subject to add it to the list: ");
		String ansSub = in.nextLine();	
		System.out.println("Type a publication year (1980-2019) to add it to the list: ");
		String ansYr = in.nextLine();	
		System.out.println("Type a page number (50-1000) to add it to the list: ");
		String ansPg = in.nextLine();	
		System.out.println("Type a book rating (0.1-10) to add it to the list: ");
		String ansRating = in.nextLine();	
		addBook(ansTitle, ansSub, ansYr, ansPg, ansRating); }
	
	public static void makeTitlesArrayList()
	{
		//add books 1-20 to the titles arrayList
		for (int i = 1; i < 21; i++)
			titles.add("Book" + i);
	}
	
	public static void makeSubjectsArrayList()
	{
		//add 5 subjects to the subjects arrayList
		for (int j = 0; j < 5; j++)
		{
			subjects.add("Programming");
			subjects.add("Data Structures");
			subjects.add("Algorithms");
			subjects.add("Operating Systems");
			subjects.add("Gaming");
		}
	}
	
	public static void makeYrArrayList()
	{
		//add years 1980-2019 to the titles arrayList
		for (int i = 1980; i < 2020; i++)
			yrs.add(i);
	}
	
	public static String getRandTitle()
	{	    
	    //get 1 of 20 titles from titles arrayList
		int i = (int) (Math.random() * titles.size());
		String title = titles.get(i); 
			
		//remove the used title from the titles arrayList 
		titles.remove(i); 
		
		//return the title
		return title; 
	}
	
	public static String getRandSub()
	{	    
	    //get 1 of 5 subjects from subjects arrayList
		int i = (int) (Math.random() * subjects.size());
		String sub = subjects.get(i); 
			
		//remove the used title from the titles arrayList 
		subjects.remove(i); 
		
		//return the title
		return sub; 
	}
	
	public static int getRandYr()
	{	    
	    //get a year 1980-2019 from yrs arrayList
		int i = (int) (Math.random() * yrs.size());
		int yr = yrs.get(i); 
			
		//remove the used title from the titles arrayList 
		yrs.remove(i); 
		
		//return the title
		return yr; 
	}

	//create the 2 arrayLists
	//add 20 books to the books arrayList
	public static void createArrayLists()
	{
		makeTitlesArrayList(); 
		makeSubjectsArrayList(); 
		makeYrArrayList();
		for (int i = 0; i < 20; i ++)
			books.add(new Book(getRandTitle(), getRandSub(), getRandYr()));
	}
	
	//list all the books
	public static void printOutAllBooks()
	{
		System.out.println("ALL THE BOOKS ARE LISTED BELOW: ");
		
		//loop through each element in the books arrayList 
		for(Book b : books)
		{
			System.out.println("Title: " + b.title + ",  Subject: " + b.subject + 
				", Year Published: " + b.yrPublished + ", Length: " 
				+ b.pageNum + ", Rating: " + b.rating); 
		}
		System.out.println(" ");
	}
	
	//list all books according to yr of publication
	public static void sortByYr()
	{
		//ref year 
		int low = 1979; 
		
		//make a temporary books arrayList to preserve original books arrayList
		ArrayList<Book> tempBooks = books; 
		
		//a new arrayList for the new ordered arrayList
		ArrayList<Book> orderedYr = new ArrayList<Book>(); 
	
		//add book object to the ordered list
	    while (orderedYr.size() <= 19)
	    {
	    	for (int i = 0; i < tempBooks.size(); i++)
	    	{
	    		if (tempBooks.get(i).yrPublished <= low)
	    		{
	    			orderedYr.add(tempBooks.get(i)); 
	    			tempBooks.remove(i);
	    		}
	    	}
	        low++; 
	    }
	    
	    //print out the new ordered arrayList
	    System.out.println("ALL THE BOOKS LISTED BY YEAR PUBLISHED : ");
	    
	    for (int i = 0; i < orderedYr.size(); i ++)
		{
	    	System.out.println("Title: " + orderedYr.get(i).title + ",  Subject: " 
	    		+ orderedYr.get(i).subject + ", Year Published: " + 
	    		orderedYr.get(i).yrPublished + ", Length: " + orderedYr.get(i).pageNum 
	    		+ ", Rating: " + orderedYr.get(i).rating);  
		}
	    System.out.println(" ");   
	}
	
	//list all books according to num pages (low to high)
	public static void sortByPgs()
	{
		//ref page num
		int low = 50; 
		
		//make a temporary books arrayList to preserve original books arrayList
		ArrayList<Book> tempBooks = books; 
		
		//a new arrayList for the new ordered arrayList
		ArrayList<Book> orderedPgs = new ArrayList<Book>(); 
	
		//add book object to the ordered list
	    while (orderedPgs.size() <= 19)
	    {
	    	for (int i = 0; i < tempBooks.size(); i++)
	    	{
	    		if (tempBooks.get(i).pageNum <= low)
	    		{
	    			orderedPgs.add(tempBooks.get(i)); 
	    			tempBooks.remove(i);
	    		}
	    	}
	    	low++; 
	    }
	    
	    //print out the new ordered arrayList
	    System.out.println("ALL THE BOOKS LISTED BY PAGE NUMBER : ");
	    
	    for (int i = 0; i < orderedPgs.size(); i ++)
		{
	    	System.out.println("Title: " + orderedPgs.get(i).title + ",  Subject: " 
		    		+ orderedPgs.get(i).subject + ", Year Published: " + 
		    		orderedPgs.get(i).yrPublished + ", Length: " + orderedPgs.get(i).pageNum 
		    		+ ", Rating: " + orderedPgs.get(i).rating);   
		}
	    System.out.println(" ");
	}
	
	//list all books according to rating (high to low)
	public static void sortByRating()
	{
		//ref rating
		double high = 10.0; 
		
		//make a temporary books arrayList to preserve original books arrayList
		ArrayList<Book> tempBooks = books; 
		
		//a new arrayList for the new ordered arrayList
		ArrayList<Book> orderedRatings = new ArrayList<Book>(); 
	
	    while (orderedRatings.size() <= 19)
	    { 
	    	for (int i = tempBooks.size()-1; i > -1; i--)
	    	{
	    		if (tempBooks.get(i).rating >= high)
	    		{
	    			orderedRatings.add(tempBooks.get(i)); 
	    			tempBooks.remove(i);
	    		}
	    	}
	    	high-=0.1; 
	    }
	    
	    //print out the new ordered arrayList
	    System.out.println("ALL THE BOOKS LISTED BY RATING : ");
	    
	    for (int i = 0; i < orderedRatings.size(); i ++)
		{
	    	System.out.println("Title: " + orderedRatings.get(i).title + ",  Subject: " 
		    		+ orderedRatings.get(i).subject + ", Year Published: " + 
		    		orderedRatings.get(i).yrPublished + ", Length: " + orderedRatings.get(i).pageNum 
		    		+ ", Rating: " + orderedRatings.get(i).rating);   
		}
	    System.out.println(" ");
	}
	
	//ask for specific subject; list books in that subject
	public static void findSub(String matchSub)
	{
		//check to see if the subject exists
		boolean exist = false; 
		for (int i = 0; i < subjects.size(); i++)
		{
			String sub = subjects.get(i); 
			if (sub.equals(matchSub))
			{
				exist = true; 
			}
		}
		
		//if subject exists, print out the book and its content
		if (exist == true)
		{
			for (Book b : books)
			{
				if (b.subject.equals(matchSub))
				{
					System.out.println("Title: " + b.title + ",  Subject: " 
				    		+ b.subject + ", Year Published: " + 
				    		b.yrPublished + ", Length: " + b.pageNum 
				    		+ ", Rating: " + b.rating); 
				}
			}
			System.out.println(" "); 
		}
		
		//if the subject doesn't exist 
		else
		{
			System.out.println("This subject doesn't exist.");
			System.out.println(" ");
		}
		
	}
	
	//ask for book title; list book contents IF book title exists
	public static void findBookTitle(String match) 
	{
		//check to see if the book title exists
		boolean exist = false; 
		int index = 0; 
		
		for (int i = 0; i < books.size(); i++)
		{
			if (books.get(i).title.equals(match))
			{
				exist = true;
				index = i; 
			}	
		}
		
		//if book title exists, print out the book's contents
		if (exist == true)
		{
			System.out.println("This book exists!");
			
			System.out.println("Title: " + match + ",  Subject: " 
		    		+ books.get(index).subject + ", Year Published: " + 
		    		books.get(index).yrPublished + ", Length: " 
		    		+ books.get(index).pageNum 
		    		+ ", Rating: " + books.get(index).rating); 
			System.out.println(" ");
		}
		
		//if the book doesn't exist
		else
		{
			System.out.println("This book doesn't exist.");
			System.out.println(" ");
		}
		
	}

	//add new book to books arrayList; ask for all 5 parts
	public static void addBook(String t, String s, String y, String pg, String rating)
	{
		//cast the parameter
		int yr = Integer.parseInt(y);
		
		//create a new book object with the contents given by the user
		Book newBook = new Book(t, s, yr);
		newBook.pageNum = Integer.parseInt(pg);
		newBook.rating = Double.parseDouble(rating);
		
		//add the new book object to the books arrayList
		books.add(newBook);
		
		System.out.println("The new book has been added to the books arrayList!"); 
		System.out.println("Title: " + newBook.title + ",  Subject: " 
	    		+ newBook.subject + ", Year Published: " + 
	    		newBook.yrPublished + ", Length: " 
	    		+ newBook.pageNum 
	    		+ ", Rating: " + newBook.rating); 
		System.out.println(" ");
	}
}