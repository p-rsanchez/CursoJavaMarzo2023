package Banco;

import java.time.LocalDate;

public abstract class Tarjeta extends Cuenta{

	protected Cuenta cuentaAsociada;
	protected LocalDate fechaDeCaducidad;
	protected String numero;
	protected String titular;
	
	public Tarjeta(String numero, String titular, LocalDate fechaDeCaducidad, String numero2, String titular2) {
		super(numero, titular);
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numero = numero2;
		this.titular = titular2;
	}
	
	public abstract Double getSaldo();
	
	public abstract void pagoEnEstablecimiento(String datos, double x);
	
	public abstract void ingresar(double x);
	
	public abstract void retirar(double x);

	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
}
