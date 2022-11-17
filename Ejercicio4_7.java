/**
 * ESTE PROGRAMA LEE TRES NOTAS INSERTADAS POR TECLADO Y REALIZA LA MEDIA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_7 {
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

		System.out.printf ("Su media es: %.2f", media);
	}
}
	
