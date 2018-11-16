package com.contreras.daniel.amazonviewer.db;

public class DataBase {
	
	public static final String URL 		= "jdbc:mysql://localhost:3306/";
	public static final String DB 		= "amazonviewer";
	public static final String USER 	= "amazonviewer";
	public static final String PASSWORD = "amazonviewer";

	public static final String READ_QUERY = "SELECT * FROM ";
	
	public static final String MATERIALT 		= "material";
	public static final int[] MATERIALT_ID 	= {1,2,3,4,5};
	
	public static final String USERT 	= "user";
	public static final int USERT_ID 	= 1;
	
	public static final String VIEWEDT 				= "viewed";
	public static final String VIEWEDT_IDMATERIAL 	= "id_material";
	public static final String VIEWEDT_IDELEMENT 	= "id_element";
	public static final String VIEWEDT_IDUSER 		= "id_user";
	
	
	public static final String MOVIET 			= "movie";
	public static final String MOVIET_ID 		= "id";
	public static final String MOVIET_TITLE 	= "title";
	public static final String MOVIET_GENRE 	= "genre";
	public static final String MOVIET_DIRECTOR 	= "director";
	public static final String MOVIET_DURATION 	= "duration";
	public static final String MOVIET_YEAR 		= "year";
	
	public static final String SERIET 					= "serie";
	public static final String SERIET_ID 				= "id";
	public static final String SERIET_TITLE 			= "title";
	public static final String SERIET_GENRE 			= "genre";
	public static final String SERIET_CREATOR 			= "creator";
	public static final String SERIET_DURATION 			= "duration";
	public static final String SERIET_YEAR 				= "year";
	public static final String SERIET_SEASONS_QUANTITY 	= "seasons_quantity";
	
	public static final String CHAPTERT					= "chapter";
	public static final String CHAPTERT_ID 				= "id";
	public static final String CHAPTERT_TITLE 			= "title";
	public static final String CHAPTERT_GENRE 			= "genre";
	public static final String CHAPTERT_DIRECTOR 		= "director";
	public static final String CHAPTERT_DURATION 		= "duration";
	public static final String CHAPTERT_YEAR 			= "year";
	public static final String CHAPTERT_SEASON_NUMBER 	= "season_number";
	
	public static final String BOOKT 				= "book";
	public static final String BOOKT_ID 			= "id";
	public static final String BOOKT_TITLE 			= "title";
	public static final String BOOKT_EDITION_DATE 	= "edition_date";
	public static final String BOOKT_GENRE 			= "genre";
	public static final String BOOKT_EDITORIAL 		= "editorial";
	public static final String BOOKT_ISBN 			= "isb";
	
	public static final String MAGAZINET 				= "magazine";
	public static final String MAGAZINET_TITLE 			= "magazine";
	public static final String MAGAZINET_ID 			= "id";
	public static final String MAGAZINET_EDITION_DATE 	= "edition_date";
	public static final String MAGAZINET_GENRE 			= "genre";
	public static final String MAGAZINET_EDITORIAL 		= "editorial";
	
	
	
	
	
}
