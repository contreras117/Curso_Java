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

/**
 * @author dcontrer
 *
 */
public class Chapter extends Movie
{
    private int id;
    private byte seasonNumber;
    
    
    //Chapter no debe tener genero
    public Chapter(String title, String genre, int duration, String director, short year, byte seasonNumber) {
		super(title, genre, duration, director, year);
		this.seasonNumber = seasonNumber;
		this.id = (int)(Math.random() * 100);
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
    
    public static ArrayList<Chapter> makeChaptersList() {
        ArrayList<Chapter> chapters = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            chapters.add(new Chapter("Chapter" + i, "Genre", 44, "Someone", (short) 2014, (byte) 1));
        }
        return chapters;
    }
    

}
