package boletin2;

import ejemplo.Entrada;;

public class Ejercicios8 {
public static void main(String[] args) {
	
	
	double base=0, altura=0, radio=0, areaT=0, areaC;
	
	System.out.println("Introduzca la base y altura del triangulo");
	base=Entrada.real();
	altura=Entrada.real();
	
	System.out.println("Introduzca el radio del circulo");
	radio=Entrada.real();
	
	areaT=(base*altura)/2;
	areaC= Math.PI*(Math.pow(radio, 2));
	
	if(areaT<areaC) {
		System.out.println("El area del circulo es mayor que la del triangulo");
	}
	if(areaT>areaC) {
		System.out.println("El area del triangulo es mayor que la del circulo");
	}
	if(areaT==areaC) {
		System.out.println("Ambos tienen el mismo area");
	}
	
	
	}
}