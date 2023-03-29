package juegoCartas;

import java.util.ArrayList;

public class JuegoCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> baraja = new ArrayList<String>();
		
		//Corazones
		
		for(int i = 0; i < 10; i++) {
			baraja.add("0" + i + " Corazones");
		}
		
		baraja.add("10 Corazones");
		baraja.add("J  Corazones");
		baraja.add("Q  Corazones");
		baraja.add("K  Corazones");
		baraja.add("A  Corazones");
		
		
		//Picas
		
		for(int i = 0; i < 10; i++) {
			baraja.add("0" + i + " Picas");
		}
		
		baraja.add("10 Picas");
		baraja.add("J  Picas");
		baraja.add("Q  Picas");
		baraja.add("K  Picas");
		baraja.add("A  Picas");
		
		//Diamantes
		
		for(int i = 0; i < 10; i++) {
			baraja.add("0" + i + " Diamantes");
		}
		
		baraja.add("10 Diamantes");
		baraja.add("J  Diamantes");
		baraja.add("Q  Diamantes");
		baraja.add("K  Diamantes");
		baraja.add("A  Diamantes");
		
		
		//Treboles
		
		for(int i = 0; i < 10; i++) {
			baraja.add("0" + i + " Treboles");
		}
		
		baraja.add("10 Treboles");
		baraja.add("J  Treboles");
		baraja.add("Q  Treboles");
		baraja.add("K  Treboles");
		baraja.add("A  Treboles");
		
	}

}
