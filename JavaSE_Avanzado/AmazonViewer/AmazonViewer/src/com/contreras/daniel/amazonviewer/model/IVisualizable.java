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
 * @since 2018  
 *
 */
public interface IVisualizable
{
	/**
	 * This method capture the exact start watching time.
	 * 
	 * @param sDate is an object {@code Date} with the exact start time.
	 * @return It returns the date and time captured.
	 * */
    Date startToSee(Date sDate);
    
    
    /**
     * This method capture the exact start and end watching time.
     * 
     * @param sDate is an object {@code Date} with the exact start time.
     * @param eDate is an object {@code Date} with the exact end time.
     * */
    void stopToSee(Date sDate, Date eDate);
}
