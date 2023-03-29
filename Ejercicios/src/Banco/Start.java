package Banco;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta = new Cuenta("1111", "Rafael Sánchez");
		
		cuenta.ingresar(1000);
		cuenta.retirar(10000);
		
		System.out.println(cuenta.getSaldo());
		
	}

}
