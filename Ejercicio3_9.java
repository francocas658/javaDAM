/**
 * ESTE PROGRAMA CALCULA EL VOLUMEN DE UN CONO CON VALORES INTRODUCIDOS POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_9 {
	public static void main (String[] args) {

		System.out.print ("Introduzca la altura del cono: ");
			double h = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduzca la radio del cono: ");
			double r = Double.parseDouble(System.console().readLine());

		double volumen = (3.14*h*(r*r))/3;

		System.out.printf ("El volumen del cono es: %.3f cm3", volumen);
	}
}

