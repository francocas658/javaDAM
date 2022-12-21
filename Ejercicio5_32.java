/**
 * ESTE PROGRAMA MUESTRA LOS DIGITOS PARES Y SU SUMA A PARTIR DE UN NUMERO INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_32 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero: ");
			long n = Long.parseLong(System.console().readLine());

		long nres;
		long nrev = 0; 
		int longi = 0;

		while (n > 0) {
			nres = n % 10;
			nrev = (nrev * 10) + nres;
			n /= 10;
			longi++;
		}

		System.out.print ("Los digitos pares son: ");
		
		int dig;
		int suma = 0;

		for (int i = 0; i < longi; i++) {
			dig = (int)(nrev % 10);
			
			if ((dig % 2) == 0) {
				System.out.print (dig+ " ");
				suma += dig;
			}
			
			nrev /= 10;
		}
		
		System.out.println ("\n5La suma de los pares es: " +suma);
	}
}

