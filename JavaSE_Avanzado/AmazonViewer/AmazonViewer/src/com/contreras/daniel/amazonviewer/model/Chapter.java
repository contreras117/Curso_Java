/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

//TODO Chapter esta heradanod el atributo genre de la clase Movie.
package com.contreras.daniel.amazonviewer.model;

import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.dao.ChapterDAO;

/**
 * Extends {@link Movie}
 * @see Film
 * 
 * @author dcontrer
 * @version 1.1 
 * @since 2018
 *
 */
public class Chapter extends Movie implements ChapterDAO
{
    private int id;
    private byte seasonNumber;
    private Serie serie;
    

    public Chapter() {
    	
    }
    
    //Chapter no debe tener genero
    public Chapter(String title, String genre, int duration, String director, short year, byte seasonNumber, Serie serie) {
		super(title, genre, duration, director, year);
		this.seasonNumber = seasonNumber;
		this.id = (int)(Math.random() * 100);
		this.serie = serie;
	}
    
    @Override
    public int getId() {
    	return this.getId();
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
    
    /**
     * @return the serie
     */
    public Serie getSerie()
    {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(Serie serie)
    {
        this.serie = serie;
    }


    public void printId() {
    	System.out.println(super.getId());
    	System.out.println(this.id);
    }
    
    @Override
    public String toString() {
       return ":: Chapter ::"+
       "\nTitle: " + getTitle() +
               "\nGenre: " + getGenre() +
               "\nYear: " + getYear() +
               "\nDirector: " + getDirector() +
               "\nDuration: " + getDuration() +
               "\nSeason: " + seasonNumber;
    }
    
    public static ArrayList<Chapter> makeChaptersList(Serie serie) {
        /*ArrayList<Chapter> chapters = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            chapters.add(new Chapter("Chapter" + i, "Genre", 44, "Someone", (short) 2014, (byte) 1, serie));
        }*/
        
        
    	Chapter chapter = new Chapter();
        return chapter.read();
    }
    
    /* (non-Javadoc)
     * @see com.contreras.daniel.amazonviewer.model.Movie#view()
     */
    @Override
    public void view()
    {
        // TODO Auto-generated method stub
        super.view();
        ArrayList<Chapter> chapters = getSerie().getChapters();
        serie.setViewed(true);
        for (Chapter chapter : chapters) {
			if (!chapter.getViewed()) {
				serie.view();
			}
		}
    }

}
