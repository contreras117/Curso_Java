/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */


//TODO La duracion en serie deberia ser un metodo que sume la duracio de todos los epsidios en chapters[]
package com.contreras.daniel.amazonviewer.model;

import java.util.ArrayList;

/**
 * @author dcontrer
 *
 */
public class Serie extends Film
{
    private int id;
    private String creator;
    private int seasonQuantity;
    private ArrayList<Chapter> chapters;
    
    
    
    
    
	public Serie(String title, String genre, int duration, String creator, int seasonQuantity) {
		super(title, genre, duration);
		this.creator = creator;
		this.seasonQuantity = seasonQuantity;
	}

	/**
     * @return the id
     */
    public int getId()
    {
        return id;
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
    public ArrayList<Chapter> getChapters()
    {
        return chapters;
    }

    
    /**
     * @param chapters the chapters to set
     */
    public void setChapters(ArrayList<Chapter> chapters)
    {
        this.chapters = chapters;
    }
    
    @Override
    public String toString() {
 	   return ":: Serie ::"+
 	   "\nTitle: " + getTitle() +
 			   "\nGenre: " + getGenre() +
 			   "\nYear: " + getYear() +
 			   "\nDirector: " + creator +
 			   "\nDuration: " + getDuration();
    }
    
}
