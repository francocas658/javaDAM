/**
 * ESTE PROGRAMA CALCULA LA MEDIA ENTRE DOS NOTAS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_21 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce la nota del primer examen: ");
			double n1 = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduce la nota del segundo examen: ");
			double n2 = Double.parseDouble(System.console().readLine());

		double media = (n1+n2)/2;

		if (media >= 5) {
			System.out.printf ("Tu nota es: %.2f", media);
		}
		
		if (media < 5) {
			System.out.print ("¿Tu recuperacion ha sido 'apto' o 'no apto'?");
				String rec = System.console().readLine();
			if (rec.equals("apto")) {
				media = 5;
				System.out.printf ("Tu nota es: %.2f", media);
			} else {
					System.out.println ("Has suspendido");
				}
		}
	}
}

