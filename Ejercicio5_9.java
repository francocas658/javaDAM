/**
 * ESTE PROGRAMA CALCULA LOS DIGITOS QUE TIENE UN NUMERO INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_9 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero entero: ");
			int num = Integer.parseInt(System.console().readLine());

		int numdig = 1;

		while (num > 10) {
			numdig++;
			num /= 10;
		}

		System.out.println ("El numero introducido tiene " +numdig+ " digitos");

	}
}

