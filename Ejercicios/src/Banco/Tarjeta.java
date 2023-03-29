package Banco;

import java.time.LocalDate;

public abstract class Tarjeta{

	protected Cuenta cuentaAsociada;
	protected LocalDate fechaDeCaducidad;
	protected String numero;
	protected String titular;
	
	public Tarjeta(String numero, String titular, LocalDate fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numero = numero;
		this.titular = titular;
	}
	
	public Cuenta getCuentaAsociada() {
		return cuentaAsociada;
	}

	public abstract Double getSaldo();
	
	public abstract void pagoEnEstablecimiento(String datos, double x);
	
	public abstract void ingresar(double x);
	
	public abstract void retirar(double x);

	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
}
