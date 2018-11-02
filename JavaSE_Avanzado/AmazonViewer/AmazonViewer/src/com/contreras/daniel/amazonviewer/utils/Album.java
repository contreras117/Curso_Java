package com.contreras.daniel.amazonviewer.utils;

import java.util.ArrayList;

public class Album {

	private static class Song {
		String[] singers;
		short duration;
		String name;
		
		public void play() {
			System.out.println("Playing the song");
		}
	}
	
	String mainSinger;
	String Name;
	ArrayList<Song> songs;
	
	public void play(int song) {
		songs.get(song).play();
	}
}
