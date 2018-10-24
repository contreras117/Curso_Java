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
    private byte seasonQuantity;
    private ArrayList<Chapter> chapters;
    
    
    
    
    
	public Serie(String title, String genre, int duration, String creator, byte seasonQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, duration);
		this.creator = creator;
		this.seasonQuantity = seasonQuantity;
		this.chapters = chapters;
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
    public byte getSeasonQuantity()
    {
        return seasonQuantity;
    }

    
    /**
     * @param seasonQuantity the seasonQuantity to set
     */
    public void setSeasonQuantity(byte seasonQuantity)
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
    
    public void fillChapters() {
        chapters = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            chapters.add(new Chapter("Chapter" + i, "", 44, "Someone", getYear(), (byte) 1));
        }
    }
    
    public static ArrayList<Serie> makeSeriesList(){
        
        ArrayList<Serie> series = new ArrayList();
        series.add(new Serie("Lost", "Adventure", 44, "J.J. Abrams", (byte)6, Chapter.makeChaptersList()));
        series.add(new Serie("Battlestar Galactica", "Action", 44, "Ronald D. Moore", (byte)4,Chapter.makeChaptersList()));
        series.add(new Serie("Breaking Bad", "Crime",44,"Vince Gilligan",(byte)5,Chapter.makeChaptersList()));
        series.add(new Serie("Game of Thrones", "Action", 57, "David Beniof", (byte)8,Chapter.makeChaptersList()));
        series.add(new Serie("How i met your mother", "Comedy", 22, "Carter Bays", (byte)9,Chapter.makeChaptersList()));
        for (Serie serie : series) {
            serie.fillChapters();
        }
        return series;  
    }
    
    
}
