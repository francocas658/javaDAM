/**
 * ESTE PROGRAMA DICE SI UN NUMERO INTRODUCIDO POR TECLADO ES PRIMO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_16 {	
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero: ");
			int n = Integer.parseInt(System.console().readLine());

		boolean nprimo = true;

		for (int i = 2; i < n; i++) {
			if ((n % i) ==0) {
				nprimo = false;
			}
		}
		
		if (nprimo) {
			System.out.println ("El numero es primo");
		} else {
				System.out.println ("El numero no es primo");
			}
	}
}

