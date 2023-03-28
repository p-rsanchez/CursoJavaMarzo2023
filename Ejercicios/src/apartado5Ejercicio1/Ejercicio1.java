package apartado5Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cargar dos variables int  con los valores 10 y 20, e indicar cual es mayor, 
//		si son iguales, o si uno es 
//		múltiplo de otro. Para probar el programa, ir cargando distintos valores en las variables. 
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}else if(numero1 == numero2) {
			System.out.println(numero1 + " es igual que " + numero2);
		}else {
			System.out.println(numero1 + " es menor que " + numero2);
		}
		
		if(numero1 % numero2 == 0) {
			System.out.println(numero1 + " es multiplo que " + numero2);
		}else {
			System.out.println(numero1 + " no es multiplo que " + numero2);

		}
		
	}

}
