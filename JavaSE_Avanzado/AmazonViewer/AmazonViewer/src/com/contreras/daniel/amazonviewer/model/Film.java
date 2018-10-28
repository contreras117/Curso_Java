package com.contreras.daniel.amazonviewer.model;

public class Film {

    private int id;
	private String title;
	private short year;
	private String genre;
	private int duration;
	private boolean viewed;
	private int timeViewed;

	public Film(String title, String genre, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.viewed = false;
		this.timeViewed = 0;
	}
	
	
    public int getId()
    {
        return id;
    }
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String isViewed() {
		return viewed ? "Yes" : "No";
	}
	
	public boolean getViewed() {
	    return this.viewed;
	}
	
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
}
