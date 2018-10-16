/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

package com.contreras.daniel.amazonviewer.model;


/**
 * @author dcontrer
 *
 */
public class Movie
{
    int id;
    private String title;
    private short year;
    private String genre;
    private int duration;
    private String director;
    private boolean viewed;
    private int timeViewed;
    
    /**
     * @param title
     * @param year
     * @param genre
     */
    public Movie(String title, short year, String genre)
    {
        super();
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    /**
     * @param title
     * @param year
     * @param genre
     * @param duration
     * @param director
     */
    public Movie(String title, short year, String genre, int duration, String director)
    {
        super();
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * @return the year
     */
    public short getYear()
    {
        return year;
    }
    
    /**
     * @param year the year to set
     */
    public void setYear(short year)
    {
        this.year = year;
    }
    
    /**
     * @return the genre
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    /**
     * @return the duration
     */
    public int getDuration()
    {
        return duration;
    }
    
    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration)
    {
        this.duration = duration;
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
    
    /**
     * @return the viewed
     */
    public boolean isViewed()
    {
        return viewed;
    }
    
    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed)
    {
        this.viewed = viewed;
    }
    
    /**
     * @return the timeViewed
     */
    public int getTimeViewed()
    {
        return timeViewed;
    }
    
    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed)
    {
        this.timeViewed = timeViewed;
    }
    
    public void showData() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
    }
    
    
}
