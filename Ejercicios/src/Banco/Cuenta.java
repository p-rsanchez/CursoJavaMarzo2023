package Banco;

import java.util.ArrayList;
import java.util.Iterator;

public class Cuenta {

	private ArrayList<Movimiento> movimientos;
	private String numero;
	private String titular;
	
	public Cuenta(String numero, String titular) {
		super();
		movimientos = new ArrayList<Movimiento>();
		this.numero = numero;
		this.titular = titular;
	}
	
	public void addMovimiento(Movimiento m) {
		movimientos.add(m);
	}
	
	public Double getSaldo() {
		double total = 0;
		
		for(Iterator<Movimiento> mov = movimientos.iterator(); mov.hasNext();) {
			Movimiento movimiento = mov.next();
			total += movimiento.getImporte();
		}
		
		return total;
	}
	
	public void ingresar(double x) {
		ingresar("INGRESO EN EFECTIVO", x);
				
	}
	
	public void ingresar(String concepto, double x) {
		Movimiento movimiento = new Movimiento();
		
		movimiento.setConcepto(concepto);
		movimiento.setImporte(x);
		
		addMovimiento(movimiento);
	}
	
	public void retirar(double x) {
		retirar("RETIRADA DE EFECTIVO", x);
	}
	
	public void retirar(String concepto, double x) {
		Movimiento movimiento = new Movimiento();
		
		if(getSaldo() > x) {
			movimiento.setConcepto(concepto);
			movimiento.setImporte(x*-1);
			addMovimiento(movimiento);
		}else {
			System.err.println("Saldo en cuenta insuficiente.");
		}

	}
	
	public void verMovimientos() {
		for(Iterator<Movimiento> mov = movimientos.iterator(); mov.hasNext();) {
			Movimiento movimiento = mov.next();
			System.out.println(movimiento);
		}
	}
}
