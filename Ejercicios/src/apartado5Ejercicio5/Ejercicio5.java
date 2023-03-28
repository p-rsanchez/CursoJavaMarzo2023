package apartado5Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
				
		while(true) {
			System.out.println("Introduce un numero (-1 para finalizar) -> ");
			numero = teclado.nextInt();
			
			if(numero != -1) {
				numeros.add(numero);
			}else {
				break;
			}
		}
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i) + " elevado a 2 = " + (numeros.get(i) * numeros.get(i)));
		}
	}

}
