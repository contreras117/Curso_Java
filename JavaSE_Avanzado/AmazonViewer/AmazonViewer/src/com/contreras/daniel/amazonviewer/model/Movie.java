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

import com.contreras.daniel.amazonviewer.dao.MovieDAO;

/**
 * Extends {@link Film}
 * Implements {@link IVisualizable}
 * 
 * @author dcontrer
 * @version 1.1
 * @since 2018
 * 
 */
public class Movie extends Film implements IVisualizable, MovieDAO
{
	//El atributo id se dejo en cada clase hija por que es una buena practica en caso de que cada id tenga reglas especificas o sea de distinto tipo.
    private int id;
    private String director;   
    
    public Movie() {
    	
    }
    
    public Movie(String title, String genre, int duration, String director, short year) {
		super(title, genre, duration);
		setYear(year);
		this.director = director;
		this.id = (int)(Math.random() * 100);
	}

    /**
     * 
     * @param id
     */
    public void setId(int id) {
		this.id = id;
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

/**
 * {@inheritDoc}
 */
@Override
public Date startToSee(Date sDate)
{
    return sDate;
}

/**
 * {@inheritDoc}
 * */
@Override
public void stopToSee(Date sDate, Date eDate)
{
    int seconds = (int)(eDate.getTime() - sDate.getTime())/1000;
    setTimeViewed(seconds);
}
    
public static ArrayList<Movie> makeMoviesList(){
	Movie movie = new Movie();
    return movie.read();  
}

public static ArrayList<Movie> getWatchedDateMovies(String strDate){
	Movie movie = new Movie();
    return movie.readDateWatchedMovies(strDate);  
}



/**
 * {@inheritDoc}
 * */
@Override
public void view()
{
    setViewed(true);
    setMovieViewed(this);
    Date dateI = startToSee(new Date());
    simulateWatch();
    stopToSee(dateI, new Date());
    System.out.println("\nYou watched:\n" + toString() + 
        "\nFor: " + getTimeViewed());
}


    
    
}
