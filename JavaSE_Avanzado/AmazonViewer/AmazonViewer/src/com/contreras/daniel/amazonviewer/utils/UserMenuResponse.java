package com.contreras.daniel.amazonviewer.utils;

import java.util.Scanner;

/**
 * <h1>UserMenuResponse</h1>
 * This class is for management of the user responses in the menu.
 * @author dcontrer
 * @version 1.1
 * @since 2018
 * 
 * */

public class UserMenuResponse {

	/**
	 * This method ask the menu option until the user give a valid one.
	 * 
	 * @return the validated user option.
	 * @throws Exception
	 * */
	public static int getResponse() {
		Scanner sc = new Scanner(System.in);
        int resp;
        try
        {
            resp = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Please enter a number...\n");
            resp = getResponse();
        }
        
        sc.close();
        return resp;
	}
}
