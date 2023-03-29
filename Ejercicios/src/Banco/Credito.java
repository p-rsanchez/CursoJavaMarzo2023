package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credito extends Tarjeta{

	private Double credito;
	private ArrayList<Movimiento> movimientos;
	
	public Credito(String numero, String titular, LocalDate fechaDeCaducidad, String numero2, String titular2,
			Double credito, ArrayList<Movimiento> movimientos) {
		super(numero, titular, fechaDeCaducidad, numero2, titular2);
		this.credito = credito;
		this.movimientos = movimientos;
	}
	
	@Override
	public Double getSaldo() {
		return cuentaAsociada.getSaldo();
	}
	
	@Override
	public void ingresar(double x) {
		cuentaAsociada.ingresar("Ingreso en cuenta asociada (cajero automático)" ,x);
	}
	
	public void liquidar(int mes, int anyo) {
		
	}
	
	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		cuentaAsociada.pagoEnEstablecimiento(datos, x);
	}
	
	@Override
	public void retirar(double x) {
		cuentaAsociada.retirar(x);
	}
	
}
