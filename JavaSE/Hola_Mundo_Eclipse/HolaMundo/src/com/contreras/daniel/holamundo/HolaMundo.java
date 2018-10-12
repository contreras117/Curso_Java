package com.contreras.daniel.holamundo;

//Upper camel case: para nombres de clases.
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		
		//Tipos de datos primitivos:
		//Los tipos de datos primitivos comienzan con minuscula.
		//Existem de 4 tipos: Enteros (byte,short, int, long),
		//De punto flotante (float y double),
		//de texto: char,
		// y logicos (boolean)
		
		//Tipos de datos enteros
		byte age = 127;
		short year = 32767;
		int idUser = 10432;
		long idTwitter = 3458938750832L;
	
		int i = 129;
		byte b = (byte) i;
		System.out.println(b);
		
		//Punto flotante
		//Por default los valores de punto flotante son tomados como
		//double por el compilador, por lo que hay que colocar una "f"
		//despues del valor para indicar que es float.
		float diameter = 34.25f;
		double price = 12345.234532534534523;
		
		//Testo
		char gender = 'F';
		
		//Logico
		boolean isVisible = true;
		
		// Nombres variables
		int variable = 1;
		int Variable = 2;
		int _variable =3;
		int $variable = 4;
		int variable1 = 5;
		//int 1variable = 6;
		
		//Constantes
		int VALUE = 0;
		int MAX_VALUE = 4;
		
		//Lower camel case: para metodos y declaracion de variables.
		int minValor = 4;
		
		
		//Arrays
		//Formas de declaraiones
		//La diferencia entre las dos formas es que si los corchetes estan
		//junto al tipo de dato, todas las variables declarada en esa linea
		// seran arreglos. Mientras que si estan junto al nombre de la variable,
		//solo esa variable sera arreglo.
		int[] numbers;
		int numbers2[];
		
		//Iniciacion del array con su capacidad.
		numbers = new int[5];
		int numbers2D [][] = new int[4][6];
		
		char [][] days = {{'M','T','W'},{'T','F','S','S'}};
		
		
		//Operadores decremento e incremento ++ --
		i = 3;
		System.out.println(i++); //Se imprime 3 por que primero se lee la variable y luego se incrementa.
		System.out.println(++i); //Se imprime 5 por que la linea anterior incremento su valor a 4, aunque no lo imprimio.
		//Cuando el operdor de incremento o decremento va antes de la variable,
		//primero se raliza el incremento y luego se lee el valor de la variable.
		//Por el contrario si el operador va despues de la variable, primer ose lee
		//el valor de la variable y luego se lee el valor.
		
		
		int p = 4;
		int q = 5;
		boolean n = (p < q)? true: false;
		boolean m = p < q;
		System.out.println(n);
		System.out.println(m);
			
				
				
	}

}
