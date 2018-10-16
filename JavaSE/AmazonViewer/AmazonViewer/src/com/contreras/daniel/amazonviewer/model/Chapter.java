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
public class Chapter
{
    private int id;
    private String title;
    private short year;
    private int duration;
    private String director;
    private boolean viewed;
    private int timeViewed;
    private byte seasonNumber;
    
    /**
     * @param title
     * @param year
     * @param duration
     */
    public Chapter(String title, short year, int duration)
    {
        super();
        this.title = title;
        this.year = year;
        this.duration = duration;
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
    
    /**
     * @return the seasonNumber
     */
    public byte getSeasonNumber()
    {
        return seasonNumber;
    }
    
    /**
     * @param seasonNumber the seasonNumber to set
     */
    public void setSeasonNumber(byte seasonNumber)
    {
        this.seasonNumber = seasonNumber;
    }

}
