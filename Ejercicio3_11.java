/**
 * ESTE PROGRAMA CALCULA CUANTOS Mb SEGUN LOS Kb INTRODUCIDOS POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_11 {
	public static void main (String[] args) {

		System.out.print ("Introduce los Kb: ");
			double kb = Double.parseDouble(System.console().readLine());

		System.out.printf ("%.0f Kb son: %.2f Mb", kb, (kb/1024));
		
	}
}
