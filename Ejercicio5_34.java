/**
 * ESTE PROGRAMA PIDE DOS NUMEROS Y FORMA OTROS DOS CON LOS PARES POR UN LADO Y LOS IMPARES POR OTRO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_34 {
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

		System.out.print ("Introduce otro numero: ");
			long n2 = Long.parseLong(System.console().readLine());

		long nres2;
		long nrev2 = 0; 
		int longi2 = 0;

		while (n2 > 0) {
			nres2 = n2 % 10;
			nrev2 = (nrev2 * 10) + nres2;
			n2 /= 10;
			longi2++;
		}

		long totpar = 0;
		long totimp = 0;
		long dig; 

		for (int i = 0; i < longi; i++) {
			dig = (int)(nrev % 10);

			if ((dig % 2) == 0) {
				totpar = totpar * 10 + dig;
			} else {
					totimp = totimp * 10 + dig;
				}

			dig = (int)(nrev2 % 10);

			if ((dig % 2) == 0) {
				totpar = totpar * 10 + dig;
			} else {
					totimp = totimp * 10 + dig;
				}

			nrev /= 10;
			nrev2 /= 10;
		}
		
		System.out.println ("Los numeros pares formados son: " +totpar);
		System.out.println ("Los numeros impares formados son: " +totimp);
	}
}



