package boletin2;

import ejemplo.Entrada;;

public class Ejercicios9 {
public static void main(String[] args) {
	

	int numA=0, numB=0, numC=0;
	
	System.out.println("Introduce tres n�meros enteros");
	numA=Entrada.entero();
	numB=Entrada.entero();
	numC=Entrada.entero();

		if(numA+numB==numC) {
			System.out.println("La suma de "+numA+" y "+numB+" es igual a "+numC);
		}
		else {

			if(numA+numC==numB) {
				System.out.println("La suma de "+numA+" y "+numC+" es igual a "+numB);
			}
			else {

				if(numB+numC==numA) {
					System.out.println("La suma de "+numB+" y "+numC+" es igual a "+numA);
				}
				else {
					System.out.println("Ning�n resultado de la suma de dos de los numeros introducidos coinciden con el tercero");
				}
			}
		}
	
	}
}