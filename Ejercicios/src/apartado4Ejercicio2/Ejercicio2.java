package apartado4Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		
		cantidad = 3;
		unidades = 12;
		precio = 5.4;
		
		importe = cantidad * unidades * precio;
		total = (int) (importe * 1.21);
		
		System.out.println("cantidad\t=" + cantidad
				+ "\nunidades\t=" + unidades
				+ "\nprecio\t=" + precio
				+ "\nImporte =" + importe
				+ "\nIva\t=" + (importe * 0.21)
				+ "\nTotal\t=" + total + "  deberia ser: " + ((double) (importe * 1.21)));
		
	}

}
