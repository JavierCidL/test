package boletin1;

import ejemplo.Entrada;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int dividendo=0, divisor=0, cociente, resto;
	
	System.out.println("Introduzca un dividendo");
	dividendo=Entrada.entero();
	
	System.out.println("Introduzca ahora el divisor");
	divisor=Entrada.entero();
	
	cociente=dividendo/divisor;
	System.out.println("El cociente de la division es: "+cociente);
	resto=dividendo%divisor;
	System.out.println("El resto de la division es: "+resto);

		
	}

}
