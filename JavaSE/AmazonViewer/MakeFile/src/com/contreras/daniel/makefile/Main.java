/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

package com.contreras.daniel.makefile;


/**
 * @author dcontrer
 *
 */
public class Main
{
   public static void main(String[] args) {
       File file = new File();
       file.setTitle(":: TTILE ::");
       file.setExtention("txt");
       file.setName("mine_archive");
       String content = file.getTitle() + "\n";
       for (int i = 0; i < 5; i++){
           content += "\nArchive, Line: " + (i+1);
       }
       file.setContent(content);
       file.makeFile();
   }
}
