/**
 * ESTE PROGRAMA DA EL NUMERO AL REVES DE UNO INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_25 {	
	public static void main (String[] args) {
		
		System.out.println ("Introduce un numero: ");
			int n = Integer.parseInt(System.console().readLine());

		int nres;
		int nrev = 0; 

		while (n > 0) {
			nres = n % 10;
			nrev = (nrev * 10) + nres;
			n /= 10;
		}

		System.out.println ("El numero " +n+ " al reves es: " +nrev);
	}
}

