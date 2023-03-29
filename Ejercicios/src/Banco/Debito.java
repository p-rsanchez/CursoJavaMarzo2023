package Banco;

import java.time.LocalDate;

public class Debito extends Tarjeta{

	public Debito(String numero, String titular, LocalDate fechaDeCaducidad, String numero2, String titular2){
		super(numero, titular, fechaDeCaducidad, numero2, titular2);
	}

	@Override
	public Double getSaldo() {
		return cuentaAsociada.getSaldo();
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		cuentaAsociada.pagoEnEstablecimiento(datos, x);
	}

	@Override
	public void ingresar(double x) {
		cuentaAsociada.ingresar(x);
	}

	@Override
	public void retirar(double x) {
		cuentaAsociada.retirar(x);
	}
	
}
