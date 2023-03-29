package Banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Credito extends Tarjeta{

	private Double credito;
	private ArrayList<Movimiento> movimientos;
	
	public Credito(String numero, String titular, LocalDate fechaDeCaducidad, Double credito) {
		super(numero, titular, fechaDeCaducidad);
		this.credito = credito;
		this.movimientos = new ArrayList<Movimiento>();
	}
	
	@Override
	public Double getSaldo() {
		double total = 0;
		
		for(Iterator<Movimiento> mov = movimientos.iterator(); mov.hasNext();) {
			Movimiento movimiento = mov.next();
			total += movimiento.getImporte();
		}
		
		return total;
	}
	
	public Double getCreditoDisponible() {
		return credito + getSaldo();
	}
	
	public void ingresar(double x) {
		Movimiento mov = new Movimiento();
		mov.setConcepto("Ingreso en cuenta asociada (cajero automatico)");
		mov.setImporte(x);
		movimientos.add(mov);
	}
	
	public void liquidar(int mes, int anyo) {
		Movimiento liquidacion = new Movimiento();
		liquidacion.setConcepto("Liquidacion de operaciones tarj. credito, " + mes + " de " + anyo);
		
		double total = 0;
		
		for(int i = this.movimientos.size()-1; i >= 0; i--) {
			Movimiento mov = (Movimiento) movimientos.get(i);
			
			if(mov.getFecha().getMonthValue() + 1 == mes && mov.getFecha().getYear() == anyo) {
				total += mov.getImporte();
				movimientos.remove(mov);
			}
			
		}
		
		liquidacion.setImporte(total);
		
		if(total != 0) {
			getCuentaAsociada().addMovimiento(liquidacion);
		}
		
	}
	
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento mov = new Movimiento();
		mov.setConcepto("Compra en -> " + datos);
		mov.setImporte(x);
		movimientos.add(mov);
	}
	
	public void retirar(double x) {
		Movimiento mov = new Movimiento();
		
		if(getSaldo() > x) {
			mov.setConcepto("Retiro en cuenta asociada (cajero automatico)");
			mov.setImporte(x*-1);
			movimientos.add(mov);
		}else {
			System.err.println("Saldo en cuenta insuficiente.");
		}
		
	}
	
}
