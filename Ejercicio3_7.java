/**
 * ESTE PROGRAMA CALCULA EL PRECIO TOTAL DESDE LA BASE IMPONIBLE INTRODUCIDA POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_7 {
	public static void main (String[] args) {

	System.out.print ("Introduzca la base imponible: ");
		double base = Double.parseDouble(System.console().readLine());
	
	double iva = 0.21;

	System.out.printf ("IVA 21: %.2f\n", (iva*base));
	
	System.out.printf ("Total: %.2f", (base*1.21));
	}
}
