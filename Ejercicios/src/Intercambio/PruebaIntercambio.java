package Intercambio;

public class PruebaIntercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intercambio<String> nombres = new Intercambio<String>("Rafael", "Pablo");
		Intercambio<Integer> numeros = new Intercambio<Integer>(1, 2);
		
		System.out.println("NOMBRES: \n uno = " + nombres.getUno() + "\ndos = " + nombres.getDos());
		System.out.println("NUMEROS: \n uno = " + numeros.getUno() + "\ndos = " + numeros.getDos());

		nombres.Intercambiar();
		numeros.Intercambiar();
		
		System.out.println("NOMBRES: \n uno = " + nombres.getUno() + "\ndos = " + nombres.getDos());
		System.out.println("NUMEROS: \n uno = " + numeros.getUno() + "\ndos = " + numeros.getDos());
		
	}

}
