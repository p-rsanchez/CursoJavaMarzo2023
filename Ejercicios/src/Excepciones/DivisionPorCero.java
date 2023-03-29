package Excepciones;

public class DivisionPorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 0;
		int numero2 = 300;
		
		try {
			numero2 /= numero1;
		}catch(ArithmeticException e) {
			System.out.println("Se ha producido un error");
		}finally {
			System.out.println("Programa finalizado");

		}
		
	}

}
