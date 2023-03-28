package apartado5Ejercicio8;

public class Ejercicio8 {

	public static int factorial(int numero) {
		
		if(numero <= 1) {
			return numero;
		}
		
		return numero * factorial(numero - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 8;
		
		System.out.println(factorial(numero));
		
	}

}
