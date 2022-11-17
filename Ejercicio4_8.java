/**
 * ESTE PROGRAMA LEE 3 NOTAS INTRODUCIDAS POR TECLADO Y MUESTRA LA MEDIA CON EL NOMBRE DE LA NOTA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_8 {
	public static void main (String[] args) {
		
		double n1, n2, n3;
		
		System.out.print ("Introduce la nota 1: ");
		n1 = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduce la nota 2: ");
		n2 = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduce la nota 3: ");
		n3 = Double.parseDouble(System.console().readLine());

		double media;

		media = (n1+n2+n3)/3;

		if (media <= 4.999) { 
		System.out.printf ("Su media es: %.2f (INSUFICIENTE)", media);
		}
		
		if ((media > 4.999) && (media <= 5.999)) { 
		System.out.printf ("Su media es: %.2f (SUFICIENTE)", media);
		}

		if ((media > 5.999) && (media <= 6.999)) {
		System.out.printf ("Su media es: %.2f (BIEN)", media);
		}

		if ((media > 6.999) && (media <= 8.999)) {
		System.out.printf ("Su media es: %.2f (NOTABLE)", media);
		}
	
		if ((media > 8.999) && (media <= 10)) {
		System.out.printf ("Su media es: %.2f (SOBRESALIENTE),", media);
		}
	}
}
