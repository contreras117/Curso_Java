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
public class Serie
{
    private int id;
    private String title;
    private short year;
    private String genre;
    private int duration;
    private String creator;
    private boolean viewed;
    private int timeViewed;
    private int seasonQuantity;
    
    private Chapter[] chapters;
    
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
     * @return the creator
     */
    public String getCreator()
    {
        return creator;
    }

    
    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator)
    {
        this.creator = creator;
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
     * @return the seasonQuantity
     */
    public int getSeasonQuantity()
    {
        return seasonQuantity;
    }

    
    /**
     * @param seasonQuantity the seasonQuantity to set
     */
    public void setSeasonQuantity(int seasonQuantity)
    {
        this.seasonQuantity = seasonQuantity;
    }

    
    /**
     * @return the chapters
     */
    public Chapter[] getChapters()
    {
        return chapters;
    }

    
    /**
     * @param chapters the chapters to set
     */
    public void setChapters(Chapter[] chapters)
    {
        this.chapters = chapters;
    }
    
}
