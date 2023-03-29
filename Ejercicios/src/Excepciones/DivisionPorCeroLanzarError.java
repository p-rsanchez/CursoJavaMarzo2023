package Excepciones;

public class DivisionPorCeroLanzarError {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		
		int numero1 = 0;
		int numero2 = 300;
		
		try {
			numero2 /= numero1;
		}finally {
			System.out.println("Programa finalizado");
		}
		
	}

}
