/**
 * ESTE PROGRAMA CALCULA QUE NOTA NECESITAS EN EL SEGUNDO EXAMEN PARA LA NOTA DESEADA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_12 {	
	public static void main (String[] args) {
		
		System.out.print ("Introduce la nota del primer examen: ");
			double n1 = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduce tu nota deseada: ");
			double nf = Double.parseDouble(System.console().readLine());

		double n2 = ((nf*100)-(n1*40))/60;

		System.out.printf ("Debes sacar un: %.2f", n2);
	}
}

