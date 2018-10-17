
package com.contreras.daniel.amazonviewer;

import java.util.Date;

import com.contreras.daniel.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		
		Movie movie = new Movie("A star is born", "drama", 140, "Bradley Cooper", (short)2018);
		movie.getTitle();
	}

	private static void showMenu() {
		int exit = 0;

		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("\nSelecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Today Report");
			System.out.println("0. Exit");

			int response = 0;

			switch (response) {
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
				System.out.println("\nSelecciona una opcion!\n");

			}
		} while (exit != 0);
	}

	private static void showMovies() {
		int response = 1;
		do {
			System.out.println("\n:: Movies  ::\n");
		} while (response != 0);
	}

	private static void showSeries() {
		int response = 1;
		do {
			System.out.println("\n:: Series  ::\n");
		} while (response != 0);
	}

	private static void showChapters() {
		int response = 1;
		do {
			System.out.println("\n:: Chapters  ::\n");
		} while (response != 0);
	}

	private static void showBooks() {
		int response = 1;
		do {
			System.out.println("\n:: Books  ::\n");
		} while (response != 0);
	}

	private static void showMagazines() {
		int response = 1;
		do {
			System.out.println("\n:: Magazines  ::\n");
		} while (response != 0);
	}

	private static void makeReport() {

	}

	private static void makeReport(Date today) {

	}
}
