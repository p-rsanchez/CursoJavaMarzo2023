package apartado5Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		double nota = -1;
		
		if(nota < 5) {
			System.out.println("Insuficiente");
		}else if(nota < 6) {
			System.out.println("Suficiente");
		}else if(nota < 7) {
			System.out.println("Bien");
		}else if(nota < 9) {
			System.out.println("Notable");
		}else if(nota <= 10) {
			System.out.println("Sobresaliente");
		}
		
	}
}
