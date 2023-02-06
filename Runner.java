package arrayListLibrary;

import java.util.ArrayList;

public class Runner 
{
	public static ArrayList<String> titles = new ArrayList<String>(); 
	public static ArrayList<String> subjects = new ArrayList<String>(); 
	
	//create the books arrayList
	public static ArrayList<Book> books = new ArrayList<Book>(); 
	
	public static ArrayList<String> booksTitles = new ArrayList<String>(); 
	public static ArrayList<String> booksSubjects = new ArrayList<String>(); 
	public static ArrayList<Integer> booksYr = new ArrayList<Integer>(); 
	public static ArrayList<Integer> booksPg = new ArrayList<Integer>(); 
	public static ArrayList<Double> booksRating = new ArrayList<Double>(); 
	
	public static void main(String[] args) 
	{	
		//create the 2 arrayLists
		makeTitlesArrayList(); 
		makeSubjectsArrayList(); 
		
		//add 20 books to the books arrayList
		//for (int i = 0; i < 20; i ++)
		for (int i = 0; i < 5; i ++)
		{
			books.add(new Book());
			
			books.get(i).title = getRandTitle(); 
			booksTitles.add(books.get(i).title); 
					
			books.get(i).subject = getRandSub();
			booksSubjects.add(books.get(i).subject); 
			
			booksYr.add(books.get(i).yrPublished); 
			booksPg.add(books.get(i).pageNum); 
			booksRating.add(books.get(i).rating); 
			
		}	
		
		//System.out.println(books.get(0).pageNum); 
		
		//list all the books
		//printOutAllBooks(books);
		
		//list all books according to yr of publication
		//sortByYr(books); 
		
		//list all books according to num pages (low to high)
		sortByPgs(books);
		
		//list all books according to rating (high to low)
		
		//ask for specific subject; list books in that subject
		
		//ask for book title; list book contents IF book title exists
		
		//add new book to books arrayList; ask for all 5 parts
	}
	
	public static void makeTitlesArrayList()
	{
		//add books 1-20 to the titles arrayList
		for (int i = 1; i < 21; i++)
			titles.add("Book" + i);
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
	
	public static String getRandSub()
	{	    
	    //get 1 of 20 subjects from subjects arrayList
		int i = (int) (Math.random() * subjects.size());
		String sub = subjects.get(i); 
			
		//remove the used title from the titles arrayList 
		subjects.remove(i); 
		
		//return the title
		return sub; 
	}
	
	public static void printOutAllBooks(ArrayList a)
	{
		for (int i = 0; i < a.size(); i ++)
		{
			System.out.println("Title: " + booksTitles.get(i)); 
			System.out.println("Subject: " + booksSubjects.get(i)); 
			System.out.println("Year Published: " + booksYr.get(i)); 
			System.out.println("Length (in pages): " + booksPg.get(i)); 
			System.out.println("Rating (0.1-10): " + booksRating.get(i)); 
			System.out.println(" ");
		}
	}
	
	public static void sortByYr(ArrayList a)
	{
		int low = 1980; 
		int index = 0; 
	    ArrayList<Integer> tempBooksYr = booksYr; 
	    ArrayList<String> tempTitles = booksTitles;
	    ArrayList<String> tempSub = booksSubjects;
	    ArrayList<Integer> tempPgs = booksPg;
	    ArrayList<Double> tempRating = booksRating;
	    
	    ArrayList<Integer> orderedYr = new ArrayList<Integer>(); 
	    ArrayList<String> yTitle = new ArrayList<String>(); 
	    ArrayList<String> ySub = new ArrayList<String>(); 
	    ArrayList<Integer> yPgs = new ArrayList<Integer>(); 
	    ArrayList<Double> yRating = new ArrayList<Double>(); 
	
	    while (orderedYr.size() <= 4)
	    {
	    	for (int i = 0; i < tempBooksYr.size(); i++)
	    	{
	    		if (tempBooksYr.get(i) < low)
	    		{
	    			index = i; 
	    			low = tempBooksYr.get(i);
	    			orderedYr.add(low); 
  
	    			yTitle.add(tempTitles.get(i));
	    			ySub.add(tempSub.get(i));
	    			yPgs.add(tempPgs.get(i));	
	    			yRating.add(tempRating.get(i));
	    			
	    			tempBooksYr.remove(i); 
	    			tempTitles.remove(i); 
	    			tempSub.remove(i); 
	    			tempPgs.remove(i); 
	    			tempRating.remove(i); 
	    		}
		        else
		        	low++; 
	    	}
	    }
	    
	    for (int i = 0; i < a.size(); i ++)
		{
			System.out.println("Title: " + yTitle.get(i)); 
			System.out.println("Subject: " + ySub.get(i)); 
			System.out.println("Year Published: " + orderedYr.get(i)); 
			System.out.println("Length (in pages): " + yPgs.get(i)); 
			System.out.println("Rating (0.1-10): " + yRating.get(i)); 
			System.out.println(" ");
		}
		
	}
	
	public static void sortByPgs(ArrayList a)
	{
		int low = 0; 
		int index = 0; 
	    ArrayList<Integer> tempBooksYr = booksYr; 
	    ArrayList<String> tempTitles = booksTitles;
	    ArrayList<String> tempSub = booksSubjects;
	    ArrayList<Integer> tempPgs = booksPg;
	    ArrayList<Double> tempRating = booksRating;
	    
	    ArrayList<Integer> orderedPgs = new ArrayList<Integer>(); 
	    ArrayList<String> yTitle = new ArrayList<String>(); 
	    ArrayList<String> ySub = new ArrayList<String>(); 
	    ArrayList<Integer> yYr = new ArrayList<Integer>(); 
	    ArrayList<Double> yRating = new ArrayList<Double>(); 
	
	    while (orderedPgs.size() <= 4)
	    {
	    	for (int i = 0; i < tempPgs.size(); i++)
	    	{
	    		if (tempPgs.get(i) < low)
	    		{
	    			index = i; 
	    			low = tempPgs.get(i);
	    			orderedPgs.add(low); 
  
	    			yTitle.add(tempTitles.get(i));
	    			ySub.add(tempSub.get(i));
	    			yYr.add(tempBooksYr.get(i));	
	    			yRating.add(tempRating.get(i));
	    			
	    			tempBooksYr.remove(i); 
	    			tempTitles.remove(i); 
	    			tempSub.remove(i); 
	    			tempPgs.remove(i); 
	    			tempRating.remove(i); 
	    		}
		        else
		        	low++; 
	    	}
	    }
	    
	    for (int i = 0; i < a.size(); i ++)
		{
			System.out.println("Title: " + yTitle.get(i)); 
			System.out.println("Subject: " + ySub.get(i)); 
			System.out.println("Year Published: " + yYr.get(i)); 
			System.out.println("Length (in pages): " + orderedPgs.get(i)); 
			System.out.println("Rating (0.1-10): " + yRating.get(i)); 
			System.out.println(" ");
		}
	}
	
	public static void sortByRating(ArrayList a)
	{
		
	}
	
	public static void findSub()
	{
		
	}
	
	public static void findBookTitle() 
	{
		
	}
	
	public static void addBook()
	{
		
	}
}

/*
 * 
 * //books.add(new Book(getRandTitle(), getRandSub()));
			
		//System.out.println(books.get(i).pageNum); 
			
			
 * for (int i = 0; i < subjects.size(); i ++)
			System.out.println(i + ": " + subjects.get(i)); 
			
			
	System.out.println(sampleBook.getTitle()); 
	System.out.println(sampleBook.getSubject()); 
	System.out.println(sampleBook.getYr()); 
	System.out.println(sampleBook.getPage()); 
	System.out.println(sampleBook.getRating()); 
 */
