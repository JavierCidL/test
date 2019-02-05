package boletin2;

import ejemplo.Entrada;;

public class Ejercicios7 {
public static void main(String[] args) {
	

	double nota=0;
	
	System.out.println("Introduce un numero");
	nota=Entrada.real();
	
	if(nota<5 && nota>=0) {
		System.out.println("INSUFICIENTE");
	}
	if(nota<6 && nota>=5) {
		System.out.println("SUFICIENTE");
	}
	if(nota<7 && nota>=6) {
		System.out.println("BIEN");
	}
	if(nota<9 && nota>=7) {
		System.out.println("NOTABLE");
	}
	if(nota>=9 && nota<=10) {
		System.out.println("SOBRESALIENTE");
	}
	if(nota<0 || nota>10) {
		System.out.println("Nota NO valida");
	}
}
}