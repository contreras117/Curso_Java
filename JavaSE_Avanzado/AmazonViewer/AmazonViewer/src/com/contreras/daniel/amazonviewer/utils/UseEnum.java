package com.contreras.daniel.amazonviewer.utils;

public class UseEnum {
	
	//Los enum se usan solo para definir colecciones de constantes.
	//Los enum deben declararse en el nivel top de la clase o en una interfaz.\
	//Los enum tambien pueden tener constructores, metodos y atrubutos, como las clases.
	public enum Day{	
		SUNDAY("Domingo"),
		MONDAY("Lunes"),
		TUESDAY("Martes"),
		WEDNESSDAY("Miercoles"),
		THURSDAY("Jueves"),
		FRIDAY("Viernes"),
		SATURDAY("Sabado");
		
		private  String spanish;
		private Day(String s) {
			spanish =s;
		}
		
		public String getSpanish() {
			return spanish;
		}
	}
	
	public static void main(String[] args){
		System.out.println(Day.SUNDAY);
		System.out.println(Day.FRIDAY);
		System.out.println(Day.TUESDAY.getSpanish());
		
		Day day = Day.FRIDAY;
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY: case SUNDAY:
			System.out.println("Weekends are the best");
			break;

		default:
			System.out.println("Midweek days are so-so");
			break;
		}
	}
}
