package boletin2;

import ejemplo.Entrada;;

public class Ejercicios3 {
public static void main(String[] args) {
	

	int numA=0, numB=0;
	
	System.out.println("Introduce un numero");
	numA=Entrada.entero();
	System.out.println("Introduce otro numero");
	numB=Entrada.entero();
	
	if (numA%numB==0) {
		System.out.println("El número "+numA+" es multiplo de "+numB);
	}
	else {
			System.out.println("El numero "+numA+" no es multiplo de "+numB);
		}	
	}
}
