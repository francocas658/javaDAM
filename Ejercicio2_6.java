/**
 * ESTE PROGRAMA CALCULA EL PRECIO TOTAL DESDE LA BASE IMPONIBLE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio2_6 {
	public static void main (String[] args) {

	double base = 57.25;
	double iva = 0.21;

	System.out.printf ("Precio= %.2f\n", base);

	System.out.printf ("IVA 21= %.2f\n", (iva*base));
	
	System.out.printf ("Total= %.2f", (base*1.21));
	}
}
