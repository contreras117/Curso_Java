package com.contreras.daniel.lambdas;

import java.util.Arrays;
import java.util.List;

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
		
		
		//Usando Labdas con una functional interface. No es necesario volver a especificar el tipo de dato del parametro de entrada,
		// ya que esta especificado en la declararion del metodod en la interfaz funcional.
		OnOneListener onOneListener2 = (String message) -> {
			System.out.println(message);
		};
		onOneListener2.onListenner("Usando Lambdas");
		
		OnOneListener onOneListener3 = message -> System.out.println("Your message: " + message);
		
		
		//Clase anonima
		OtherListenner otherListenner  = new OtherListenner() {
			
			@Override
			void onListenner(String message) {
				// TODO Auto-generated method stub
				
			}
		};
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.forEach(System.out::print);
		
	}

}
