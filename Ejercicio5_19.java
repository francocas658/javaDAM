/**
 * ESTE PROGRAMA CREA UNA PIRAMIDE CON LA ALTURA Y RELLENO QUE SE DESEE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_19 {
	public static void main (String[] args) {

		System.out.print ("Introduce el relleno de la piramide: ");
			String r = System.console().readLine();

		System.out.print ("Introduce la altura de la piramide: ");
			int h = Integer.parseInt(System.console().readLine());

		int b = 1;
		int l = 1;
		int esp = h-1;

		while (b <= h) {

			for (int i = 1; i <= esp; i++) {
				System.out.print (" ");
			}

			for (int i = 1; i <= l; i++) {
				System.out.print (r);
			}

			System.out.println();

			b++;
			esp--;
			l += 2;
		}
	}
}

