/**
 * ESTE PROGRAMA LEE UN Y TE DICE LA CANTIDAD DE DIGITOS PARES E IMPARES TIENE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_41 {	
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero: ");
			long n = Long.parseLong(System.console().readLine());

		long pares = 0;
		long impares = 0;

		do {

			if ((n % 2) == 0) {
				pares++;
			} else {
				impares++;
			}
		
			n /= 10;
		} while (n > 0);

		System.out.println ("La cantidad de numeros pares es: " +pares);
		System.out.println ("La cantidad de numeros impares es: " +impares);
	}
}

