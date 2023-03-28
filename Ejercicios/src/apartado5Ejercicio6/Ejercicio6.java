package apartado5Ejercicio6;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for(int i = 100; i >= 0; i-=23) {
			numeros.add(i);
		}
		
		System.out.println(numeros);
		
	}

}
