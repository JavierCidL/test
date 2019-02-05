package boletin2;

import ejemplo.Entrada;;

public class Ejercicios4 {
public static void main(String[] args) {
	

	int numA=0, numB=0;
	
	System.out.println("Introduce un numero");
	numA=Entrada.entero();
	System.out.println("Introduce otro numero");
	numB=Entrada.entero();
	
	if(numA==numB) {
		System.out.println("Los numeros son iguales");
	}
	else {
		if(numA%numB==0) {
			System.out.println("El numero "+numA+" es multiplo de "+numB);
		}
		if(numB%numA==0) {
			System.out.println("El numero "+numB+" es multiplo de "+numA);
		}
		
		if(numB%numA!=0 && numA%numB!=0) {
			System.out.println("Los numeros no son multiplos entre sí");
		}
	}
	}
}