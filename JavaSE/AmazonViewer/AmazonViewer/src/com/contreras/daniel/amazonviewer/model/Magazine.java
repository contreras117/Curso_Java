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
public class Magazine extends Publication
{
    private int id;
    
    


	public Magazine(String title, Date editionDate, String genre, String editiorial, String[] authors) {
		super(title, editionDate, genre, editiorial, authors);
	}

	/**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

}
