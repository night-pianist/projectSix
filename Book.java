package arrayListLibraryFinal;

import java.util.ArrayList;

public class Book 
{
	public String title = " ";
	public String subject = " "; 
	public int yrPublished = 0; 
	public int pageNum = 0; 
	public double rating = 0.0; 
	
	//constructor
	public Book(String t, String s, int y)
	{	
		this.title = t; 
		this.subject = s; 
		this.yrPublished = y;
		pageNum = (int) (Math.random() * 950) + 50;  
		rating = (Math.random() * 9.9) + 0.1;  
		
		//yrPublished = (int) (Math.random() * 40) + 1980;
	} 
	
	//getter methods for Book class
	public String getTitle()
	{
		return title; 
	}
	
	public String getSubject()
	{
		return subject; 
	}
	
	public int getYr()
	{
		return yrPublished; 
	}
	
	public int getPage()
	{
		return pageNum; 
	}
	
	public double getRating()
	{
		return rating; 
	}		
}
