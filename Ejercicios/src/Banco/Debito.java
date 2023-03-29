package Banco;

import java.time.LocalDate;

public class Debito extends Tarjeta{

	public Debito(String numero, String titular, LocalDate fechaDeCaducidad){
		super(numero, titular, fechaDeCaducidad);
	}

	public Double getSaldo() {
		return getCuentaAsociada().getSaldo();
	}

	public void pagoEnEstablecimiento(String datos, double x) {
		getCuentaAsociada().retirar("Compra en -> " + datos, x);
	}

	public void ingresar(double x) {
		getCuentaAsociada().ingresar("Ingreso en cajero automatico", x);
	}

	public void retirar(double x) {
		getCuentaAsociada().retirar("Retirada en cajero automatico", x);
	}
	
}
