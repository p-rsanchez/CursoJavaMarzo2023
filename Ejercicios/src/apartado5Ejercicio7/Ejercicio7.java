package apartado5Ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		
		for(int i = 0; i < 5*10; i++) {
			if(i%5 == 0) {
				total += i;
			}
		}
		
		System.out.println(total);
	}

}
