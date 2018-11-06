/*
 * Copyright (c) 2018 by PROS, Inc.  All Rights Reserved.
 * This software is the confidential and proprietary information of
 * PROS, Inc. ("Confidential Information").
 * You may not disclose such Confidential Information, and may only
 * use such Confidential Information in accordance with the terms of
 * the license agreement you entered into with PROS.
 */

package com.contreras.daniel.makefile;

import com.contreras.daniel.string.StringUtils;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <h1>File</h1>
 * File is a class to generate text files.
 * <p>
 * This class is used to generate a text file giving it a name, a title
 * the extension and the content.
 * 
 * @author dcontrer
 * @version 1.1
 * @since 2018
 * 
 *
 */
public class File
{
    private String content;
    private String name;
    private String title;
    private String extention;
    
    /**
     * @return the content
     */
    public String getContent()
    {
        return content;
    }
    
    /**
     * @param content the content of the file to create.
     */
    public void setContent(String content)
    {
        this.content = content;
    }
    
    /**
     * @return the name of the file.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name the name of the file.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return the title of the file.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @param title the title of the file.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * @return the extension of the file
     */
    public String getExtension()
    {
        return extention;
    }
    
    /**
     * @param extention the extension of the file
     */
    public void setExtention(String extention)
    {
        this.extention = extention;
    }
    
    /**
     * This method creates the file with the parameters gave to it.
     * 
     * */
    public void makeFile() {
        if (!StringUtils.isEmpty(getContent()) && !StringUtils.isEmpty(getTitle()) && !StringUtils.isEmpty(getName()))
        {
            try {
                java.io.File file = new java.io.File(getName() + "." + getExtension());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                
                try(bw){
                	bw.write(getContent());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            
            
        }
        else {
            System.out.println("Write something");
        }
    }
    
}
