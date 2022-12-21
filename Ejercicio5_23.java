/**
 * ESTE PROGRAMA PIDE UNA SERIE DE NUMEROS POR TECLADO Y REALIZA LA MEDIA, LOS NUMEROS INTRODUCIDOS Y EL TOTAL DE LOS NUMEROS INTRODUCIDOS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_23 {
	public static void main (String[] args) {
		
		System.out.println ("Introduce numeros: "); 

		int n, ntot = 0, npos = 0;

		do {
			n = Integer.parseInt(System.console().readLine());
			ntot += n;
			npos++;
		} while (ntot < 10000);

		System.out.println ("La suma de los numeros introducidos es: " +ntot);
		System.out.println ("Ha introducido " +npos+ " numeros");
		System.out.println ("La media es: " +ntot/npos);
	}
}

