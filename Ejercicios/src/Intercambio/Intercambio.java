package Intercambio;

public class Intercambio<T> {

	private T uno;
	private T dos;
	
	public Intercambio(T uno, T dos) {
		super();
		this.uno = uno;
		this.dos = dos;
	}

	public T getUno() {
		return uno;
	}

	public void setUno(T uno) {
		this.uno = uno;
	}

	public T getDos() {
		return dos;
	}

	public void setDos(T dos) {
		this.dos = dos;
	}
	
	public void Intercambiar() {
		T temp = this.uno;
		
		this.uno = this.dos;
		this.dos = temp;
	}
	
}
