package com.contreras.daniel.amazonviewer.utils;

public class Nested {
	
	private static int x = 1;
	
	public static class StaticNested {
		private void run() {
			staticMethod();
			//Solo puedo usar metodos staticos de la clase externa.
		}
	}
	
	
	public class Inner{
		private void run() {
			staticMethod();
			noStatichMethod();
			//Puedo usar metodos tanto estaticos como no estaticos de
			// la clase externa.
		}
	}
	
	public void noStatichMethod() {
		//Do somtehing
	}
	
	public static void staticMethod() {
		//Do something
	}
	
	
	public void test() {
		//Manera de declarar clases static anidadas. No es necesario instancia la clase externa.
		Nested.StaticNested nestedStatic = new Nested.StaticNested();
		nestedStatic.run();
		
		//Manera de declarar clases inner. Es necesario crear un objeto de la clase externa.
		Nested nested = new Nested();
		Nested.Inner inner = nested.new Inner();
		
		run();
		
		SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
			
			@Override
			void run() {
				//De esta manera es posblie declarar una clases anonima que proviene de una
				//clase abstracta en la cual aqui mismo estamos definiendo su comportamieto.
				System.out.println("Sobrescribiendo el metodo run de la clase abstracta SimpleAbstractClass");
			}
		};
		
	}
	
	public void run() {
		
		//Tambien se pueden declarar clases dentro de metodos.
		class Local {
			void run() {
				System.out.println("Metod Run de la clase interna al metodo");
			}
		}
		
		Local local = new Local();
		local.run();
	}
	
}
	
