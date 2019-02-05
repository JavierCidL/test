package boletin1;

import ejemplo.Entrada;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int edad;
	String nombre;
	
	System.out.println("Introduzca su nombre");
	nombre=Entrada.cadena();
	
	System.out.println("Introduzca ahora la edad");
	edad=Entrada.entero();
	
	System.out.println("Hola "+nombre+" tienes "+edad+" años ¡Que mayor eres!");
	}

}
