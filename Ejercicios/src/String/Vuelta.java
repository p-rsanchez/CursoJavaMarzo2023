package String;

public class Vuelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String entrada = "";
		
		for(int i = 0; i < args.length; i++) {
			entrada += args[i] + " ";
		}
		
		System.out.println("fase-1-" + entrada);
		
		
		for(int i = entrada.length()-1; i >= 0; i--) {
			System.out.print(entrada.charAt(i));
		}
		
		
		int longitud = entrada.length();
		String entradaTemp = "";
		for(int i = longitud -1; i >= 0; i--) {
			entradaTemp += entrada.charAt(i);
		}
		
		System.out.println("\nfase-2-" + entradaTemp);
		
		entradaTemp = "";
		
		for(int i = 0; i < entrada.length(); i++) {
			
			switch(entrada.charAt(i)) {
				
			case 'a':
			case 'A':
				entradaTemp += "4";
				break;
				
			case 'e':
			case 'E':
				entradaTemp += "3";	
				break;
							
			case 'i':
			case 'I':
				entradaTemp += "0";
				break;
				
			case 'o':
			case 'O':
				entradaTemp += "1";
				break;
				
			case 'u':
			case 'U':
				entradaTemp += "9";
				break;
				
			default:
				entradaTemp += entrada.charAt(i);
				break;
			}
			
		}
		
		System.out.println("fase-3-" + entradaTemp);
		
		entradaTemp = "";
		char caracter = args[0].charAt(0);
				
		for(int i = 1; i < entrada.indexOf(caracter, 1); i++) {
			entradaTemp += entrada.charAt(i);
		}
		
		System.out.println("fase-4-" + entradaTemp);

		
		entradaTemp = "";
		for(int i = args.length-1; i >= 0; i--) {
			entradaTemp += args[i] + " ";
		}
		
		System.out.println("fase-5-" + entradaTemp);
		
	}

}
