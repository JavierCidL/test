package boletin2;

import ejemplo.Entrada;;

public class Ejercicios5 {
public static void main(String[] args) {
	

	char car1=' ', car2=' ', car3=' ';
	
	System.out.println("Introduce tres caracteres");
	car1=Entrada.caracter();
	car2=Entrada.caracter();
	car3=Entrada.caracter();
	
	if(car1>car2 && car1>car3) {
		if(car2>car3) {
			System.out.println(car1+" "+car2+" "+car3);
		}
		else {
			System.out.println(car1+" "+car3+" "+car2);
		}
	}
	if(car2>car1 && car2>car3) {
		if(car1>car3) {
			System.out.println(car2+" "+car1+" "+car3);
		}
		else {
			System.out.println(car2+" "+car3+" "+car1);
		}
	}	
	if(car3>car2 && car3>car1) {
		if(car1>car2) {
			System.out.println(car3+" "+car1+" "+car2);
		}
		else {
			System.out.println(car3+" "+car2+" "+car1);
		}
	}	
		
	}
}