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
    
    

	public Book(String title, Date editionDate, String genre, String editiorial, String[] authors, String isbn) {
		super(title, editionDate, genre, editiorial, authors);
		this.isbn = isbn;
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

    /* (non-Javadoc)
     * @see com.contreras.daniel.amazonviewer.model.IVisualizable#startToSee(java.util.Date)
     */
    @Override
    public Date startToSee(Date dateI)
    {
        return dateI;
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
        books.add(new Book("Ender's Game", new Date(1985,8,21), "Sci-fi", "Planeta",new String[] {"Orson Scott Card"} , "ADSF2342SA342D"));
        books.add(new Book("A Game of Thrones", new Date(1996,8,6), "Fantasy", "Bantam Spectra",new String[] {"George R. R. Martin"} , "3214AFA43LHUI22"));
        return books;  
    }
    
    public void view() {
    	setReaded(true);
    	Date dateI = startToSee(new Date());
    	for (int i = 0; i < 100000; i++) {
            System.out.println("Reading..........\n");
        }
        stopToSee(dateI, new Date());
        System.out.println("\nYou watched:\n" + toString() + 
            "\nFor: " + getTimeReaded());
    }
    
}
