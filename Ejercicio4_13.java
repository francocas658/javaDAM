/**
 * ESTE PROGRAMA LEE 3 NUMEROS INTRODUCIDOS POR TECLADO Y TE LOS ORDENA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_13 {
	public static void main (String[] args) {
		
		int ord;

		System.out.print ("Introduzca el primer numero: ");
			int a = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduzca el segundo numero: "); 
			int b = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduzca el tercer numero: ");
			int c = Integer.parseInt(System.console().readLine());

		if (a>b) {
			ord = a;
			a = b;
			b = ord;
		}

		if (b>c) {
			ord = b;
			b = c;
			c = ord;
		}

		System.out.printf ("Los numeros introducidos son: %d, %2d, %3d", a, b, c);
	}	
}
