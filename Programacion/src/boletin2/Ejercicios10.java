package boletin2;

import ejemplo.Entrada;;

public class Ejercicios10 {
public static void main(String[] args) {
	

	String player1=" ", player2=" ";
	

	System.out.println("Jugador UNO introduce: piedra, papel o tijera");
	player1=Entrada.cadena();
	
	System.out.println("Jugador UNO introduce: piedra, papel o tijera");
	player2=Entrada.cadena();
	
	//Para cuando saca piedra el jugador UNO
	
	if(player1.equals("piedra") && player2.equals("tijera")) {
		System.out.println("Jugador Uno ha ganado");
	}
	if(player1.equals("piedra") && player2.equals("papel")) {
		System.out.println("Jugador DOS ha ganado");
	}

	
	//Para cuando saca papel el jugador UNO
	
	if(player1.equals("papel") && player2.equals("piedra")) {
		System.out.println("Jugador Uno ha ganado");
	}
	if(player1.equals("papel") && player2.equals("tijera")) {
		System.out.println("Jugador DOS ha ganado");
	}

	
	//Para cuando saca tijera el jugador UNO
	
	if(player1.equals("tijera") && player2.equals("papel")) {
		System.out.println("Jugador Uno ha ganado");
	}
	if(player1.equals("tijera") && player2.equals("piedra")) {
		System.out.println("Jugador DOS ha ganado");
	}

	// Para cuando empatan
	
	if(player1.equals(player2)) {
		System.out.println("Han empatado");
	}
	}
}