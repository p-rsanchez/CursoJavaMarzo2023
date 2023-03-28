package apartado3Ejercicio1;

import java.text.DecimalFormat;

public class Datos2 {
	DecimalFormat formato1 = new DecimalFormat("#.00");
	
	public int dia;
	public int nDni;
	public float precio;
	final boolean ACTIVO;
	
	
	public Datos2(int dia, int nDni, float precio) {
		super();
		this.dia = dia;
		this.nDni = nDni;
		this.precio = precio;
		ACTIVO = true;
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

	@Override
	public String toString() {
		return "Dia\t" + dia + "\nDni\t" + nDni + "\nPrecio\t" + precio + "\nActivo?\t" + ACTIVO;
	}
	
	
	
}
