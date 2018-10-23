
package com.contreras.daniel.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.contreras.daniel.amazonviewer.model.Book;
import com.contreras.daniel.amazonviewer.model.Chapter;
import com.contreras.daniel.amazonviewer.model.Magazine;
import com.contreras.daniel.amazonviewer.model.Movie;

public class Main
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        showMenu();

        // Chapter chapter = new Chapter("Pilot","algo", 54,"Alguien",(short)2004,(byte)1);
        // chapter.printId();
        // System.out.println(chapter);

        // Book book = new Book("EGM",new Date(), "sci-fi", "Omega", "231asgfasd132");
        // System.out.println(book);

        // Magazine magazine = new Magazine("EGM",new Date(), "sci-fi", "Televisa");
        // System.out.println(magazine);

    }

    private static void showMenu()
    {
        int response = 0;

        do
        {
            System.out.println("WELCOME TO AMAZON VIEWER");
            System.out.println("\nSelect the number of the desired option");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Today Report");
            System.out.println("0. Exit");

            response = getResponse();

            switch (response)
            {
                case 0:
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println("\nSelect an option!\n");

            }
        }
        while (response != 0);
    }

    private static void showMovies() {
		int response = 0;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		
		do {
			System.out.println("\n:: Movies  ::\n");
			
			for (Movie movie : movies) {
			    System.out.println((movies.indexOf(movie)+1) + ". " + movie.getTitle() + " Watched: " + movie.isViewed());
			}
			System.out.println("0. Return to Menu.\n");
			
			do {
			    response = getResponse();
			}while (response <0 || response > movies.size()-1);
			
			
			if (response == 0) {
			    break;
			}
			else {
			    Movie movieSelected = movies.get(response - 1);
			    movieSelected.setViewed(true);
			    Date dateI = movieSelected.startToSee(new Date());
			    
			    try
                {
                    Thread.sleep(10000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
			    
			    movieSelected.stopToSee(dateI, new Date());
			    System.out.println("\nYou watched:\n" + movieSelected + 
			        "\nFor: " + movieSelected.getTimeViewed());
			}
			
			
		} while (response != 0);
	}

    private static void showSeries()
    {
        int response = 1;
        do
        {
            System.out.println("\n:: Series  ::\n");
        }
        while (response != 0);
    }

    private static void showChapters()
    {
        int response = 1;
        do
        {
            System.out.println("\n:: Chapters  ::\n");
        }
        while (response != 0);
    }

    private static void showBooks()
    {
        int response = 1;
        do
        {
            System.out.println("\n:: Books  ::\n");
        }
        while (response != 0);
    }

    private static void showMagazines()
    {
        int response = 1;
        do
        {
            System.out.println("\n:: Magazines  ::\n");
        }
        while (response != 0);
    }

    private static void makeReport()
    {

    }

    private static void makeReport(Date today)
    {

    }

    private static int getResponse()
    {
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

        return resp;
    }
}
