package boletin1;

import ejemplo.Entrada;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	final double PI=3.14;
	double radio, area, perimetro;

	
	System.out.println("Introduzca su numero real");
	radio=Entrada.real();

	area=PI*(radio*radio);
	System.out.println("El resultado del area del radio "+radio+" es "+area);
	perimetro=(PI*2)*radio;
	System.out.println("El resultado del perimetro del radio "+radio+" es "+perimetro);
	}

}