package apartado5Ejercicio3;

public class Ejercicio3 {

	public static boolean versionUno(int dia, int mes, int anyo) {
		
		if(dia > 0 && dia < 31) {
			if(mes > 0 && mes < 13) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean versionDos(int dia, int mes, int anyo) {
		
		if((mes == 1 || mes == 3 || mes == 5 || mes == 7  || mes == 8  || mes == 10  || mes == 12) && dia <= 31) {
			return true;
		}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
			return true;
		}else if(mes == 2 && dia <= 28) {
			return true;
		}
		
		return false;
	}
	
	public static boolean versionTres(int dia, int mes, int anyo) {
		
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if(dia <= diasMes[mes-1]) {
			return true;
		}
		
		return false;
	}
	
public static boolean versionCuatro(int dia, int mes, int anyo) {
		
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if(anyo%4 == 0 && anyo%100 == 0 && anyo%400 == 0) {
			diasMes[1] = 29;
		}
		
		if(dia <= diasMes[mes-1]) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia = 29;
		int mes = 2;
		int anyo = 1900;
		
		
		
		System.out.println(versionUno(dia, mes, anyo));
		System.out.println(versionDos(dia, mes, anyo));
		System.out.println(versionTres(dia, mes, anyo));
		System.out.println(versionCuatro(dia, mes, anyo));
	}

}
