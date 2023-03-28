package apartado3Ejercicio2;

public class DatosArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[][] mes = new int[5][7];
		
		int contador = 0;
		
		for(int i = 0; i < mes.length; i++) {
			for(int j = 0; j < mes[i].length; j++){
				if(contador <= 31) {
					mes[i][j] = contador++;
				}
			}
		}
		
		for(int i = 0; i < mes.length; i++) {
			for(int j = 0; j < mes[i].length; j++){
				System.out.println(mes[i][j]);
			}
		}
		
		
	}
	
}
