package boletin2;

import ejemplo.Entrada;;

public class Ejercicios2 {
public static void main(String[] args) {
	

	int numA=0, numB=0;
	
	System.out.println("Introduce un numero");
	numA=Entrada.entero();
	System.out.println("Introduce otro numero");
	numB=Entrada.entero();
	
	if (numA>numB) {
		System.out.println("El número "+numA+" es mayor que"+numB);
	}
	else {
		if (numA<numB) {
			System.out.println("El numero "+numA+" es menor que "+numB);
		}
		else {
			System.out.println("Ambos numeros son iguales");
		}
	}
	
	}
}
