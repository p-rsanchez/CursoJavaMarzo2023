package apartado5Ejercicio4;

public class Ejercicio4 {

	public static String menor10(String numero) {
		String texto = "";
		
		switch(numero) {
		case "0":
			texto = "0";
			break;
		
		case "1":
			texto = "uno";
			break;
			
		case "2":
			texto = "dos";
			break;
			
		case "3":
			texto = "tres";
			break;
			
		case "4":
			texto = "cuatro";
			break;
			
		case "5":
			texto = "cinco";
			break;
			
		case "6":
			texto = "seis";
			break;
			
		case "7":
			texto = "siete";
			break;
			
		case "8":
			texto = "ocho";
			break;
			
		case "9":
			texto = "nueve";
			break;
		}
		
		return texto;
	}
	
	public static String menor15(String numero) {
		String texto = "";
		
		switch(numero) {
		case "10":
			texto = "diez";
			break;
			
		case "11":
			texto = "once";
			break;
			
		case "12":
			texto = "doce";
			break;
			
		case "13":
			texto = "trece";
			break;
			
		case "14":
			texto = "catorce";
			break;
			
		case "15":
			texto = "quince";
			break;
		
		}
		
		return texto;
	}
	
	public static String prefijo(String numero) {
		String texto = "";
		
		switch(numero) {
		case "1":
			texto = "dieci";
			break;
			
		case "2":
			texto = "veinti";
			break;
			
		case "3":
			texto = "treinta";
			break;
			
		case "4":
			texto = "cuarenta";
			break;
			
		case "5":
			texto = "cicuenta";
			break;
			
		case "6":
			texto = "sesenta";
			break;
			
		case "7":
			texto = "setenta";
			break;
			
		case "8":
			texto = "ochenta";
			break;
			
		case "9":
			texto = "noventa";
			break;
		}
		
		return texto;
	}
	
	public static void main(String[] args) {
		
		String numero = "99";
		String numeroTexto = "";
		
		if(Integer.parseInt(numero) < 10) {
			System.out.println(menor10(numero));
		}else if(Integer.parseInt(numero) < 15) {
			System.out.println(menor15(numero));
		}else if(Integer.parseInt(numero)<30) {
			if(numero.equals("20")) {
				System.out.println("veinte");
			}else {
				System.out.println(prefijo(String.valueOf(numero.charAt(0))) + menor10(String.valueOf(numero.charAt(1))));
			}
		}else {
			if(Integer.parseInt(numero)%10 == 0) {
				System.out.println(prefijo(String.valueOf(numero.charAt(0))));
			}else {
				System.out.println(prefijo(String.valueOf(numero.charAt(0))) + " y " +  menor10(String.valueOf(numero.charAt(1))));

			}
		}
			
	}
}
