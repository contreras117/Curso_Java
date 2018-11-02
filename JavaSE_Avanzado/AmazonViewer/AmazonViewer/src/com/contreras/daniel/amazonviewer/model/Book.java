/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

package com.contreras.daniel.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

import com.contreras.daniel.amazonviewer.utils.UserMenuResponse;

/**
 * @author dcontrer
 *
 */
public class Book extends Publication implements IVisualizable
{
    private int id;
    private String isbn;
    private boolean read;
    private int timeRead;
    private ArrayList<Page> pages;
    
    

	public Book(String title, Date editionDate, String genre, String editiorial, String[] authors, String isbn, ArrayList <Page> pages) {
		super(title, editionDate, genre, editiorial, authors);
		this.isbn = isbn;
		this.pages = pages;
	}

	/**
     * @return the id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * @return the isbn
     */
    public String getIsbn()
    {
        return isbn;
    }
    
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    /**
     * @return the readed
     */
    public boolean getRead()
    {
        return read;
    }
    
    public String isRead() {
    	return read ? "Yes":"No";
    }
    
    /**
     * @param readed the readed to set
     */
    public void setReaded(boolean readed)
    {
        this.read = readed;
    }
    
    /**
     * @return the timeReaded
     */
    public int getTimeReaded()
    {
        return timeRead;
    }
    
    /**
     * @param timeReaded the timeReaded to set
     */
    public void setTimeReaded(int timeReaded)
    {
        this.timeRead = timeReaded;
    }
    
    public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}


    /* (non-Javadoc)
     * @see com.contreras.daniel.amazonviewer.model.IVisualizable#startToSee(java.util.Date)
     */
    @Override
    public Date startToSee(Date sDate)
    {
        return sDate;
    }

    /* (non-Javadoc)
     * @see com.contreras.daniel.amazonviewer.model.IVisualizable#stopToSee(java.util.Date, java.util.Date)
     */
    @Override
    public void stopToSee(Date sDate, Date eDate)
    {
        int seconds = (int)(eDate.getTime() - sDate.getTime())/1000;
        setTimeReaded(seconds);        
    }
    
    public static ArrayList<Book> makeBooksList(){
        ArrayList<Book> books = new ArrayList();
        ArrayList<Page> pages = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
			pages.add(new Book.Page(i + 1, "This is the content of page number "+ (i+1)));
		}
        
        books.add(new Book("Ender's Game", new Date(1985,8,21), "Sci-fi", "Planeta",new String[] {"Orson Scott Card"} , "ADSF2342SA342D", pages));
        books.add(new Book("A Game of Thrones", new Date(1996,8,6), "Fantasy", "Bantam Spectra",new String[] {"George R. R. Martin"} , "3214AFA43LHUI22", pages));
        return books;  
    }
    
    public void view() {
    	Date dateI = startToSee(new Date());
    	boolean firstPage = false;
    	
    	int pageNumber = 0;
    	do {
    		System.out.println("........................");
    		System.out.println("Page - " + pages.get(pageNumber).getNumber());
    		System.out.println(pages.get(pageNumber).getContent());
    		System.out.println("........................");
    		
    		firstPage = pageNumber == 0 ? true: false;
    		
    		if (!firstPage) {
    			System.out.println("1. Previous page");
    		}

    		System.out.println("2. Next page");
    		System.out.println("0. Close Book");
    		
    		int response = UserMenuResponse.getResponse(0, 2);
    		while(firstPage && response == 1) {
    			System.out.println("Please select a valid option");
    			response = UserMenuResponse.getResponse(0, 2);
    		}
    		
    		if( response == 0) {
    			break;
    		}
    		else if(response == 1) {
    			pageNumber--;
    		}
    		else if (response == 2) {
    			pages.get(pageNumber).setRead(true);
    			pageNumber++;
			}
    		
    	}while (pageNumber < pages.size());
    	
    	boolean isBookRead = true;
    	for (Page page : pages) {
			if(!page.isRead()) {
				isBookRead = false;
			}
		}
    	setReaded(isBookRead);
        stopToSee(dateI, new Date());
        System.out.println("\nYou have read:\n" + toString() + 
            "\nFor: " + getTimeReaded());
    }
    
	public static class Page {
    	int id;
    	int number;
    	String content;
    	boolean read;
    	
		public boolean isRead() {
			return read;
		}

		public void setRead(boolean read) {
			this.read = read;
		}

		public Page(int number, String content) {
			super();
			this.number = number;
			this.content = content;
			read = false;
		}
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
    	
    }
    
}
