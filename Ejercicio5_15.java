/**
 * ESTE PROGRAMA CALCULA LAS POTENCIAS INTRODUCIDA POR TECLADO Y LAS ANTERIORES HASTA EXPONENTE 1
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_15 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce una base: ");
			int b = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduce un exponente: ");
			int e = Integer.parseInt(System.console().readLine());

		int p;
		int e1;
	
		for (int i = 1; i <= e; i++) {
			p = 1;
			e1 = i;

			for (int h = 1; h < e1; h++) {
				p *= b;
			}

		System.out.println (b+ " elevado a " +i+ " = " +p);
		}
	}
}

