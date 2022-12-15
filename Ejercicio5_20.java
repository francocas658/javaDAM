/**
 * ESTE PROGRAMA CREA UNA PIRAMIDE HUECA CON LA ALTURA Y RELLENO QUE SE DESEE 
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_20 {
	public static void main (String[] args) {

		System.out.print ("Introduce el relleno de la piramide: ");
			String r = System.console().readLine();

		System.out.print ("Introduce la altura de la piramide: ");
			int h = Integer.parseInt(System.console().readLine());

		int b = 1;
		int l = 0;
		int esp = h-1;
		int espint = 0;

		while (b < h) {

			for (int i = 1; i <= esp; i++) {
				System.out.print (" ");
			}

			System.out.print(r);

			for (int i = 1; i < espint; i++) {
				System.out.print (" ");
			}
	
			if (h > 1) {
				System.out.print (r);
			}



			System.out.println();

			b++;
			esp--;
			espint += 2;	
			}
			
			for (int i = 1; i <= h*2; i++) {
				System.out.print (r);

		}
	}
}
