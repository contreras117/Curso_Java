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


/**
 * @author dcontrer
 *
 */
public class Chapter extends Movie
{
    private int id;
    private byte seasonNumber;
    
    
    
    public Chapter(String title, String genre, int duration, String director, short year, byte seasonNumber) {
		super(title, genre, duration, director, year);
		this.seasonNumber = seasonNumber;
	}

	/**
     * @return the id
     */
    public int getId()
    {
        return id;
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
