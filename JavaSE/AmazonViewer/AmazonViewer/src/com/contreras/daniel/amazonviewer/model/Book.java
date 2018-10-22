/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

package com.contreras.daniel.amazonviewer.model;

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
    public boolean isReaded()
    {
        return read;
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
    
}
