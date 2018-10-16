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
public class Magazine
{
    private int id;
    private String title;
    private Date editionDate;
    private String genre;
    private String editiorial;
    private String[] authors;
    
    /**
     * @param title
     * @param editionDate
     * @param editiorial
     */
    public Magazine(String title, Date editionDate, String editiorial)
    {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editiorial = editiorial;
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
     * @return the editionDate
     */
    public Date getEditionDate()
    {
        return editionDate;
    }
    
    /**
     * @param editionDate the editionDate to set
     */
    public void setEditionDate(Date editionDate)
    {
        this.editionDate = editionDate;
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
     * @return the editiorial
     */
    public String getEditiorial()
    {
        return editiorial;
    }
    
    /**
     * @param editiorial the editiorial to set
     */
    public void setEditiorial(String editiorial)
    {
        this.editiorial = editiorial;
    }
    
    /**
     * @return the authors
     */
    public String[] getAuthors()
    {
        return authors;
    }
    
    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors)
    {
        this.authors = authors;
    }
}
