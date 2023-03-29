package Banco;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Start {

	static Cuenta cuenta;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cuenta = new Cuenta("12345", "Rafael");
		cuenta.ingresar(1000);
		cuenta.ingresar("Prueba ingresar", 2000);
		cuenta.retirar(200);
		cuenta.retirar("Prueba retirar", 500);
		
		LocalDate fecha = LocalDate.of(LocalDate.now().getYear() + 5, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
		
		Debito debito = new Debito("123456789", "Rafael", fecha);
		debito.setCuentaAsociada(cuenta);
		debito.ingresar(100);
		debito.retirar(50);
		System.out.println(debito.getSaldo());
		
		Credito credito = new Credito("123456789", "Rafael", fecha, 1000000.0);
		credito.setCuentaAsociada(cuenta);
		credito.ingresar(100);
		credito.retirar(50);
		System.out.println(credito.getSaldo());
		
		cuenta.verMovimientos();
		
	}

}
