package Banco;

import java.time.LocalDate;

public class Movimiento {
	
	private String concepto;
	private LocalDate fecha;
	private Double importe;
	
	public Movimiento() {
		super();
		this.fecha = LocalDate.now();
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
}
