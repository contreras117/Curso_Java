package com.contreras.daniel.amazonviewer.model;

import java.util.Date;

public class Publication {
    private String title;
    private Date editionDate;
    private String genre;
    private String editiorial;
    private String[] authors;
    
    
    
	public Publication(String title, Date editionDate, String genre, String editiorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.genre = genre;
		this.editiorial = editiorial;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getEditiorial() {
		return editiorial;
	}
	public void setEditiorial(String editiorial) {
		this.editiorial = editiorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
    
	@Override
	   public String toString() {
		   return "Title: " + getTitle() +
				   "\nGenre: " + getGenre() +
				   "\nYear: " + editionDate.getYear() +
				   "\nEdotorial: " + editiorial +
				   "\nAuthors: " + authors;
	   }
    
}
