
package com.contreras.daniel.amazonviewer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.contreras.daniel.amazonviewer.model.Book;
import com.contreras.daniel.amazonviewer.model.Chapter;
import com.contreras.daniel.amazonviewer.model.Magazine;
import com.contreras.daniel.amazonviewer.model.Movie;
import com.contreras.daniel.amazonviewer.model.Serie;
import com.contreras.daniel.amazonviewer.utils.UserMenuResponse;
import com.contreras.daniel.makefile.File;


/**
 * <h1>AmazonViewer</h1>
 * AmazonViewer is a program that allow to watch Movies, TV Series
 * with its their respective Chapters, Books and Magazines. It allows you
 * to generate general reports and with with today's date.
 * <p>
 * There are some rules, like that all elements can be watched or read, except
 * the Magazines. They only can be watched as a catalog.
 * 
 * @author dcontrer
 * @version 1.1
 * @since 2018
 * */
public class Main
{
    static ArrayList<Movie> movies = Movie.makeMoviesList();
    static ArrayList<Serie> series = Serie.makeSeriesList();
    static ArrayList<Book> books = Book.makeBooksList();
    
    //static ArrayList<Serie> series = new ArrayList();
    //static ArrayList<Book> books = new ArrayList<>();
    
    
    public static void main(String[] args)
    {
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

            response = UserMenuResponse.getResponse(0,6);

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
                    makeReport(LocalDate.now());
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

			//Se usa un atomic integer para obtener el indice de cada pelicula. AL usarse como programacion funcional no puedo cambiar
			//variables explicitamente dentro de la lambda.
			AtomicInteger atomicInteger = new AtomicInteger(1);
			movies.forEach(m -> System.out.println(atomicInteger.getAndIncrement() + ". " + m.getTitle() + "Watched: " + m.isViewed()));

			System.out.println("0. Return to Menu.\n");
			
			response = UserMenuResponse.getResponse(0,movies.size());
			
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
            
            response = UserMenuResponse.getResponse(0, series.size());
            
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
            
            response = UserMenuResponse.getResponse(0, chapters.size());
                        
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
            
            response = UserMenuResponse.getResponse(0, books.size());
            
            if(response == 0) {
            	break;
            }
            else {
            	Book bookSelected = books.get(response - 1);
            	bookSelected.view();
            	
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
        File file = prepareReport("Reporte", ":: WHAT HAVE YOU WATCHED ::", "txt", movies);
        file.makeFile();
        
    }

    private static void makeReport(LocalDate lcdDate)
    {
    	String strToday = lcdDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    	ArrayList<Movie> arlTodayMovies = Movie.getWatchedDateMovies(strToday);
        File file = prepareReport("Reporte_" + strToday, ":: WHAT YOU HAVE WATCHED ::", "txt", arlTodayMovies);
        file.makeFile();
    }
    
    private static File prepareReport(String name, String title, String extention, ArrayList<Movie> movies) {
        File file = new File();
        file.setName(name);
        file.setExtention(extention);
        file.setTitle(title);
        
        StringBuilder content = new StringBuilder();
        content.append(file.getTitle() + "\n\n" + ":: MOVIES ::\n\n");
        
        //Ejemplo de predicate usado en un filter en la siguiente linea de codigo.
        Predicate<Movie> filterMovies = m -> m.getViewed();
        movies.stream().filter(filterMovies).forEach(m -> content.append(m + "\n\n"));
        
        
        
        content.append("\n\n" + ":: SERIES ::\n\n");
        //Ejemplo de consumer usado mas abajo.
        Consumer <Serie> consumer = s -> {
        	ArrayList<Chapter> serieChapters = s.getChapters();
        	serieChapters.stream().filter(c -> 
        		c.getViewed()).forEach(c-> content.append(c.toString() + "\n\n"));
        };
        series.forEach(consumer);
        
        /*
        content += "\n\n" + ":: BOOKS ::\n";
        for (Book book : books)
        {
            if(book.getRead()) {
                content += book + "\n";
            }        
        }*/
        file.setContent(content.toString());
        return file;
    }
    
    
}
