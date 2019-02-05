package boletin2;

import ejemplo.Entrada;;

public class Ejercicios1 {
public static void main(String[] args) {
	

	int num=0;
	
	System.out.println("Introduce un numero");
	num=Entrada.entero();
	
	if (num>0) {
		System.out.println("El número es positivo");
	}
	else {
		if (num==0) {
			System.out.println("El número es cero");
		}
		else {
			System.out.println("El número es negativo");
		}
	}
	
	}
}
