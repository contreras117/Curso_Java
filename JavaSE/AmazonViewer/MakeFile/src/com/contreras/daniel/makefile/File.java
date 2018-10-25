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
 * @author dcontrer
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
     * @param content the content to set
     */
    public void setContent(String content)
    {
        this.content = content;
    }
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
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
     * @return the extention
     */
    public String getExtention()
    {
        return extention;
    }
    
    /**
     * @param extention the extention to set
     */
    public void setExtention(String extention)
    {
        this.extention = extention;
    }
    
    public void makeFile() {
        if (!StringUtils.isEmpty(getContent()) && !StringUtils.isEmpty(getTitle()) && !StringUtils.isEmpty(getName()))
        {
            try {
                java.io.File file = new java.io.File(getName() + "." + getExtention());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();
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
