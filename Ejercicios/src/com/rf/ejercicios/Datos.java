package com.rf.ejercicios;

import java.text.DecimalFormat;

public class Datos {
	DecimalFormat formato1 = new DecimalFormat("#.00");
	
	private int dia;
	private int nDni;
	private float precio;
	private boolean ACTIVO;
	
	
	public Datos(int dia, int nDni, float precio, boolean ACTIVO) {
		super();
		this.dia = dia;
		this.nDni = nDni;
		this.precio = precio;
		ACTIVO = ACTIVO;
	}

	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getnDni() {
		return nDni;
	}
	
	public void setnDni(int nDni) {
		this.nDni = nDni;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public boolean isACTIVO() {
		return ACTIVO;
	}
	
	public void setACTIVO(boolean ACTIVO) {
		ACTIVO = ACTIVO;
	}

	@Override
	public String toString() {
		return "Dia\t" + dia + "\nDni\t" + nDni + "\nPrecio\t" + precio + "\nActivo?\t" + ACTIVO;
	}
	
	
	
}
