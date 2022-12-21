/**
 * ESTE PROGRAMA CONVIERTE UN NUMERO INTRODUCIDO POR TECLADO AL SISTEMA DE PALOTES
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_37 {
	public static void main (String[] args) {
		
				
		System.out.print ("Introduce un numero: ");
			int n = Integer.parseInt(System.console().readLine());

		int nres;
		int nrev = 0; 
		int longi = 0;
		int dig = 0;

		System.out.print ("El numero: " +n+ " es el ");

		while (n > 0) {
			nres = n % 10;
			nrev = (nrev * 10) + nres;
			n /= 10;
			longi++;
		}

		for (int i = 0; i < longi; i++) {
			dig = nrev % 10;
			nrev /= 10;
			
			for (int m = 0; m < dig; m++) {
				System.out.print (" | ");
			}
			
			if (i < longi) {
				System.out.print ("-");
			}
		}
		
		System.out.print (" en el sistema de palotes.");
	}
}

