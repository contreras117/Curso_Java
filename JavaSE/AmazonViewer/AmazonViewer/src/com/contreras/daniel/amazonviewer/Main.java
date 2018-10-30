
package com.contreras.daniel.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.contreras.daniel.amazonviewer.model.Book;
import com.contreras.daniel.amazonviewer.model.Chapter;
import com.contreras.daniel.amazonviewer.model.IVisualizable;
import com.contreras.daniel.amazonviewer.model.Magazine;
import com.contreras.daniel.amazonviewer.model.Movie;
import com.contreras.daniel.amazonviewer.model.Serie;
import com.contreras.daniel.makefile.File;

public class Main
{
    
    static ArrayList<Movie> movies = Movie.makeMoviesList();
    static ArrayList<Serie> series = Serie.makeSeriesList();
    static ArrayList<Book> books = Book.makeBooksList();

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        showMenu();
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
		do {
			System.out.println("\n:: Movies  ::\n");
			
			for (Movie movie : movies) {
			    System.out.println((movies.indexOf(movie)+1) + ". " + movie.getTitle() + " Watched: " + movie.isViewed());
			}
			System.out.println("0. Return to Menu.\n");
			
			do {
				if (response > movies.size()) {
					System.out.println("Please select a valid option!");
				}
			    response = getResponse();
			}while (response <0 || response > movies.size());
			
			
			if (response == 0) {
			    break;
			}
			else {
			    Movie movieSelected = movies.get(response - 1);
			    movieSelected.view();
			}
			
			
		} while (response != 0);
	}

    private static void showSeries()
    {
        int response = 0;
        do
        {   
            System.out.println("\n:: Series  ::\n");
            for( Serie serie : series) {
                System.out.println((series.indexOf(serie)+1) + ". "+ serie.getTitle() + " Watched: " + serie.isViewed());
            }
            System.out.println("0. Return to Menu.\n");
            
            do {
                response = getResponse();
            }while (response < 0 || response > series.size());
            
            if (response == 0) {
                break;
            }
            else {
                showChapters(series.get(response - 1).getChapters());
            }
            
        }while (response != 0);
    }

    private static void showChapters(ArrayList<Chapter> chapters)
    {
        int response = 0;
        do
        {
            System.out.println("\n:: Chapters  ::\n");
            for (Chapter chapter : chapters) {
                System.out.println((chapters.indexOf(chapter)+1) + ". " + chapter.getTitle() + " Watched: " + chapter.isViewed());
            }
            System.out.println("0. Return to Menu.\n");
            
            
            do {
                response = getResponse();
            }while (response <0 || response > chapters.size());
            
            
            if (response == 0) {
                break;
            }
            else {
                Chapter chapterSelected = chapters.get(response - 1);
                chapterSelected.view();
            }
            
        }
        while (response != 0);
    }

    private static void showBooks()
    {
        int response = 0;
        do
        {
            System.out.println("\n:: Books  ::\n");
            for (Book book : books) {
				System.out.println((books.indexOf(book)+ 1) + ". " + book.getTitle() + " Read: " + book.isRead());
			}
            System.out.println("0. Return to Menu.\n");
            
            do {
            	response = getResponse();
            }while(response <0 || response > books.size());
            
            if(response == 0) {
            	break;
            }
            else {
            	Book bookSelected = books.get(response - 1);
            	bookSelected.setReaded(true);
            	Date dateI = bookSelected.startToSee(new Date());
                simulateWatch();
                bookSelected.stopToSee(dateI, new Date());
                System.out.println("\nYou watched:\n" + bookSelected + 
                    "\nFor: " + bookSelected.getTimeReaded());
            	
            }
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
        File file = prepareReport("Reporte", ":: WHAT HAVE YOU WATCHED ::", "txt");
        file.makeFile();
        
    }

    private static void makeReport(Date today)
    {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String stToday = sf.format(today);
        File file = prepareReport("Reporte_" + stToday, ":: WHAT HAVE YOU WATCHED ::", "txt");
        file.makeFile();
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
    
    private static File prepareReport(String name, String title, String extention) {
        File file = new File();
        file.setName(name);
        file.setExtention(extention);
        file.setTitle(title);
        String content = file.getTitle() + "\n\n" + ":: MOVIES ::\n";
        for (Movie movie : movies)
        {
            if(movie.getViewed()) {
                content += movie + "\n";
            }
        }
        content += "\n\n" + ":: SERIES ::\n";
        for (Serie serie : series)
        {
        	boolean printed = false;
        	for (Chapter chapter : serie.getChapters()) {
				if (chapter.getViewed()) {
					if (!printed) {
						content += serie + "\n";
						printed = true;
					}
					content += chapter + "\n";
				}
			}
        }
        content += "\n\n" + ":: BOOKS ::\n";
        for (Book book : books)
        {
            if(book.getRead()) {
                content += book + "\n";
            }        }
        file.setContent(content);
        return file;
    }
    
    
}
