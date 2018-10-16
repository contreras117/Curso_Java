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
public class Book
{
    private int id;
    private String title;
    private Date editionDate;
    private String genre;
    private String editiorial;
    private String[] authors;
    private String isbn;
    private boolean read;
    private int timeRead;
    
    /**
     * @param title
     * @param editionDate
     * @param editiorial
     * @param isbn
     */
    public Book(String title, Date editionDate, String editiorial, String isbn)
    {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editiorial = editiorial;
        this.isbn = isbn;
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
    
    /**
     * @return the isbn
     */
    public String getIsbn()
    {
        return isbn;
    }
    
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    /**
     * @return the readed
     */
    public boolean isReaded()
    {
        return read;
    }
    
    /**
     * @param readed the readed to set
     */
    public void setReaded(boolean readed)
    {
        this.read = readed;
    }
    
    /**
     * @return the timeReaded
     */
    public int getTimeReaded()
    {
        return timeRead;
    }
    
    /**
     * @param timeReaded the timeReaded to set
     */
    public void setTimeReaded(int timeReaded)
    {
        this.timeRead = timeReaded;
    }
}
