package com.contreras.daniel.lambdas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnOneListener onOneListener = new OnOneListener() {
			
			@Override
			public void onListenner(String message) {
				// TODO Auto-generated method stub
				System.out.println(message);
			}
		};
		
		onOneListener.onListenner("Sin Lambdas (Functional interface)");
		
		
		//Usando Labdas con una functional interface
		OnOneListener onOneListener2 = (String message) -> {
			System.out.println(message);
		};
		onOneListener2.onListenner("Usando Lambdas");
		
		
		//Clase anonima
		OtherListenner otherListenner  = new OtherListenner() {
			
			@Override
			void onListenner(String message) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
