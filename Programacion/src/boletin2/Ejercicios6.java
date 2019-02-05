package boletin2;

import ejemplo.Entrada;;

public class Ejercicios6 {
public static void main(String[] args) {
	

	int numA=0;
	
	System.out.println("Introduce un numero");
	numA=Entrada.entero();
	
	if(numA>=0 && numA<=9999) {
		if(numA>=1000) {
			System.out.println("El numero tiene 4 cifras");
		}
		else {
			if(numA>=100) {
				System.out.println("El numero tiene 3 cifras");
			}
			else {
				if(numA>=10) {
					System.out.println("El numero tiene 2 cifras");
				}
				else {
					if(numA>=1) {
						System.out.println("El numero tiene 1 cifras");
					}
				}
			}
		}

		}
	}
}