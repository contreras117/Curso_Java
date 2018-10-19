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
public class Movie extends Film implements IVisualizable
{
	//El atributo id se dejo en cada clase hija por que es una buena practica en caso de que cada id tenga reglas especificas o sea de distinto tipo.
    private int id;
    private String director;   
    

    public Movie(String title, String genre, int duration, String director, short year) {
		super(title, genre, duration);
		setYear(year);
		this.director = director;
		this.id = (int)(Math.random() * 100);
	}

	/**
     * @return the id
     */
    public int getId()
    {
        return id;
    }
      
    /**
     * @return the director
     */
    public String getDirector()
    {
        return director;
    }
    
    /**
     * @param director the director to set
     */
    public void setDirector(String director)
    {
        this.director = director;
    }
    
   @Override
   public String toString() {
	   return ":: Movie ::"+ 
	   "\nTitle: " + getTitle() +
			   "\nGenre: " + getGenre() +
			   "\nYear: " + getYear() +
			   "\nDirector: " + getDirector() +
			   "\nDuration: " + getDuration();
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
    setTimeViewed(seconds);
}
    
    
    
    
}
