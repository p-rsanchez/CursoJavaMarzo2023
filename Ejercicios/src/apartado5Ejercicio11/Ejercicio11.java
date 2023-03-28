package apartado5Ejercicio11;

import java.util.ArrayList;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> primos = new ArrayList<Integer>();
		int contador = 0;
		
		for(int i = 0; i < 101; i++ ) {
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					contador++;
					
					if(contador > 2) {
						continue;
					}
				}
			}
			
			if(contador == 2) {
				primos.add(i);
				contador = 0;
			}else {
				contador = 0;
			}
		}
		
		System.out.println(primos);
		
	}

}
