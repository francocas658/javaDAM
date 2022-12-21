/**
 * ESTE PROGRAMA PIDE UNA SERIE DE NUMEROS POR TECLADO Y REALIZA LA MEDIA DE LOS IMPARES, LOS NUMEROS TOTALES INTRODUCIDOS Y EL MAXIMO PAR
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_21 {
	public static void main (String[] args) {
		
		System.out.println ("Introduce numeros (para parar introduce un numero negativo: ");
		
		int n, npos = 0, nimp = 0, sumimp = 0, maxpar = 0;

		do {
			n = Integer.parseInt(System.console().readLine());
		
			if (n >= 0) {
				npos++;
		
				if ((n % 2) == 1) {
					sumimp += n;
					nimp++;
				} else {
						
						if (n > maxpar) {maxpar = n;} 
					}				
			}
		} while (n >= 0);

		System.out.println ("Se han introducido " +npos+ " numeros");
		System.out.println ("La media de los impares es: " +sumimp/nimp);
		System.out.println ("El maximo numero par es: " +maxpar);
	}
}

