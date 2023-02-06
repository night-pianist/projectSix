package arrayListLibrary;

import java.util.ArrayList;

public class Book 
{
	public static String title = " ";
	public static String subject = " "; 
	public static int yrPublished = 0; 
	public static int pageNum = 0; 
	public static double rating = 0.0; 
	
	
	//constructor
	public Book()
	{	
		
		//subject = getRandSubject(); 
		yrPublished = (int) (Math.random() * 40) + 1980;  
		pageNum = (int) (Math.random() * 950) + 50;  
		rating = (Math.random() * 9.9) + 0.1;  
	} 
	
	//getter methods for Book class
	public static String getTitle()
	{
		return title; 
	}
	
	public static String getSubject()
	{
		return subject; 
	}
	
	public static int getYr()
	{
		return yrPublished; 
	}
	
	public static int getPage()
	{
		return pageNum; 
	}
	
	public static double getRating()
	{
		return rating; 
	}
	
	
	//getRandTitle(); 
			//System.out.println("a book has been created"); 
			
		    //print out new array
		    //for (int j = 0; j < titles.length-1; j++)
		      //System.out.println(titles[j]); 
			
}
